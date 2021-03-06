package com.newland.cloud.springcloudpeyment9090.dao;


import com.newland.cloud.springcloudcommons.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ${linfengpeng}
 * @Title: PaymentDao
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/13 11:19
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPayment(@Param("id") long id);

}
