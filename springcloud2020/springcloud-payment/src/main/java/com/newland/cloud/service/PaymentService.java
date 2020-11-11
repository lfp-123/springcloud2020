package com.newland.cloud.service;


import com.newland.cloud.springcloudcommons.pojo.Payment;

/**
 * @author ${linfengpeng}
 * @Title: PaymentService
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/13 13:54
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPayment(long id);
}
