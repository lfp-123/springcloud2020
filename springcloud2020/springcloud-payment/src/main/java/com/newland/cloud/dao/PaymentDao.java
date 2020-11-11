package com.newland.cloud.dao;

import com.newland.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
