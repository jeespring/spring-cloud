package com.jeespring.order.controller;

import com.jeespring.order.feign.PayFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    PayFeignService payFeignService;

    @GetMapping("/selectById")
    public String selectById(@RequestParam("id") Long id) {
        return payFeignService.selectById(id);
    }

    @GetMapping("/selectAll")
    public String selectAll() {
        return payFeignService.selectAll();
    }
}
