package com.newland.cloud.springcloudhystrixorder80.service;

import com.newland.cloud.springcloudhystrixorder80.exception.Fallbackmethod;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ${linfengpeng}
 * @Title: HystrixService
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/17 9:21
 */
@Service
@FeignClient(value = "CLOUD-HYSTRIX-PAYMENT-SERVICE",fallback = Fallbackmethod.class)
public interface HystrixService {


    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/time/{id}")
    public String paymentInfo_no(@PathVariable("id") Integer id);
}
