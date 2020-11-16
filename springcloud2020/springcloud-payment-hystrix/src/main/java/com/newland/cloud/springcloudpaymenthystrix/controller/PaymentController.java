package com.newland.cloud.springcloudpaymenthystrix.controller;


import com.newland.cloud.springcloudpaymenthystrix.serviceImpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${linfengpeng}
 * @Title: PaymentController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/13 13:56
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentServiceImpl service;



    @Value("server.port")
    private String port;

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        return service.paymentInfo_OK(id);
    }

    @GetMapping("/payment/hystrix/time/{id}")
    public String paymentInfo_no(@PathVariable("id") Integer id){
        return service.paymentInfo_Timeout(id);
    }



}
