package com.atguigu.springcloud.alibaba.service;


import com.newland.cloud.springcloudcommons.pojo.CommentResult;
import com.newland.cloud.springcloudcommons.pojo.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommentResult<Payment> paymentSQL(Long id)
    {
        return new CommentResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
