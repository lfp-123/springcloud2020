package com.newland.cloud.springcloudconsulpayment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ${linfengpeng}
 * @Title: ConsulController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/16 11:09
 */
@RestController
public class ConsulController {
    @Value("server.port")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
