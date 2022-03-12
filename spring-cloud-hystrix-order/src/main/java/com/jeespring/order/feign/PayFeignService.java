package com.jeespring.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: PayFeignService
 * @Description:
 * @Author 张朝阳
 * @Date 2020/11/25 19:46
 */
@Service
@FeignClient(value = "SPRING-CLOUD-HYSTRIX-PAY", path = "/pay",fallback = PayFeignFallBackService.class)
public interface PayFeignService {

    @GetMapping("/selectById")
    String selectById(@RequestParam("id") Long id);

    @GetMapping("/selectAll")
    String selectAll();
}
