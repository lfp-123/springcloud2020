package com.newland.cloud.springcloudalibabapayment9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${linfengpeng}
 * @Title: PaymentController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/18 15:18
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/payment/get/{id}")
    public String getPort(@PathVariable("id") Integer id){
        return "register nacas service payment port:"+port+" id is "+id;
    }
}
