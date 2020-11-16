package com.newland.cloud.springcloudorderopenfen.service;

import com.newland.cloud.springcloudcommons.pojo.CommentResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ${linfengpeng}
 * @Title: OpenService
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/16 16:38
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OpenService {


    @GetMapping(value = "/payment/get/{id}")
    public CommentResult getPaymentById(@PathVariable("id") Long id);
}
