package com.jeespring.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Title: PayFeignService
 * @Description:
 * @Author 张朝阳
 * @Date 2020/11/25 19:46
 */
@Service
@FeignClient(value = "SPRING-CLOUD-SLEUTH-PAY", path = "/pay")
public interface PayFeignService {

    @GetMapping("/selectAll")
    String selectAll();
}
