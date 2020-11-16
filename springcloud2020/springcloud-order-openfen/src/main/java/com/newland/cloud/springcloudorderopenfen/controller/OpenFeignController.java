package com.newland.cloud.springcloudorderopenfen.controller;

import com.newland.cloud.springcloudcommons.pojo.CommentResult;
import com.newland.cloud.springcloudcommons.pojo.Payment;
import com.newland.cloud.springcloudorderopenfen.service.OpenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ${linfengpeng}
 * @Title: OpenFeign
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/16 16:37
 */
@RestController
public class OpenFeignController {

    @Autowired
    private OpenService service;

    @GetMapping("/consumer/payment/get/{id}")
    public CommentResult<Payment> getPayment(@PathVariable("id") Long id){
        CommentResult paymentById = service.getPaymentById(id);
        return paymentById;
    }


}
