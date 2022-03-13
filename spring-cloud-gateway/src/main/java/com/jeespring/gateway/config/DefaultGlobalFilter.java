package com.jeespring.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Title: DefaultGlobalFilter
 * @Description:
 * @Author 张朝阳
 * @Date 2021/3/1 13:58
 */
@Slf4j
@Component
public class DefaultGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        log.info("DefaultGlobalFilter login username : {}", username);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
