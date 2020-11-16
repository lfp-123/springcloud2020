package com.newland.cloud.springcloudpaymenthystrix.serviceImpl;


import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author ${linfengpeng}
 * @Title: PaymentServiceImpl
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/13 13:53
 */
@Service
public class PaymentServiceImpl {
    public String paymentInfo_OK(Integer id){

        return "线程池："+Thread.currentThread().getName()+"payment_ok"+id+"  success!!";

    }

    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeOut,id: "+id+" 耗时3秒种  ";
    }


}
