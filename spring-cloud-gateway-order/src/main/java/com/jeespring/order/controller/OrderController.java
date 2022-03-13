package com.jeespring.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/selectById")
    public String selectById(@RequestParam("id") Long id) {
        String result = "请求成功,id=" + id;
        return result;
    }

    @GetMapping("/selectAll")
    public String selectAll() {
        String result = "请求成功";
        return result;
    }
}
