package com.newland.cloud.springcloudpayment9091.controller;



import com.newland.cloud.springcloudcommons.pojo.CommentResult;
import com.newland.cloud.springcloudcommons.pojo.Payment;
import com.newland.cloud.springcloudpayment9091.service.serviceImpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
    private PaymentServiceImpl paymentService;
    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public CommentResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if(i>0){
            return new CommentResult(200,"插入数据库成功"+port,i);
        }else {
            return new CommentResult(444,"插入数据库失败",null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommentResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPayment(id);
        if(payment!=null){
            return new CommentResult(200,"查询成功"+port,payment);
        }else {
            return new CommentResult(444,"查询失败！！",null);
        }
    }

}
