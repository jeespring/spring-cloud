package com.jeespring.order.feign;

import org.springframework.stereotype.Component;

/**
 * PayFeignFallBackService
 *
 * @author 张朝阳
 * @date 2022/3/13 1:10:10
 */
@Component
public class PayFeignFallBackService implements PayFeignService{

    @Override
    public String selectById(Long id) {
        return "系统繁忙，调用 selectById() 方法失败!";
    }

    @Override
    public String selectAll() {
        return "系统繁忙，调用 selectAll() 方法失败!";
    }
}
