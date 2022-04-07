package com.jeespring.pay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * PayController
 *
 * @author 张朝阳
 * @date 2022/3/11 0:19:19
 */
@RestController
@RequestMapping("/pay")
public class PayController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/selectAll")
    public String selectAll() {
        String result = "请求成功,请求端口号:" + port;
        return result;
    }
}
