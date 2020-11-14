package com.newland.cloud.springcloudpayment9091.service.serviceImpl;


import com.newland.cloud.springcloudcommons.pojo.Payment;
import com.newland.cloud.springcloudpayment9091.dao.PaymentDao;
import com.newland.cloud.springcloudpayment9091.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ${linfengpeng}
 * @Title: PaymentServiceImpl
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/13 13:53
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        int i = paymentDao.create(payment);
        return i;
    }

    @Override
    public Payment getPayment(long id) {
        Payment payment = paymentDao.getPayment(id);
        return payment;
    }
}
