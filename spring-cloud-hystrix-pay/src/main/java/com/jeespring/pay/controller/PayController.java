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

    @GetMapping("/selectById")
    public String selectById(@RequestParam("id") Long id) {
        String result = "请求成功,id=" + id;
        return result;
    }

    @GetMapping("/selectAll")
    public String selectAll() throws Exception {
        String result = "请求成功";
        Thread.sleep(6000);
        return result;
    }
}
