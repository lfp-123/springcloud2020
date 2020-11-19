package com.atguigu.springcloud.alibaba.service;


import com.newland.cloud.springcloudcommons.pojo.CommentResult;
import com.newland.cloud.springcloudcommons.pojo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther zzyy
 * @create 2020-02-25 18:15
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommentResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
