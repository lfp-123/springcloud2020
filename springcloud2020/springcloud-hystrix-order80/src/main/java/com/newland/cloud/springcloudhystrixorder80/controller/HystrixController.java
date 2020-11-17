package com.newland.cloud.springcloudhystrixorder80.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.newland.cloud.springcloudhystrixorder80.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${linfengpeng}
 * @Title: HystrixController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/17 9:21
 */
@RestController
@DefaultProperties(defaultFallback = "paymentInfoTimeoutHandle")
public class HystrixController {
    @Autowired
    private HystrixService service;


    @GetMapping("/consumer/hyok/{id}")
    public String getSucess(@PathVariable("id") Integer id){
        return service.paymentInfo_ok(id);
    }

//    @GetMapping("/consumer/hyno/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandles",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    public String getNo(@PathVariable("id") Integer id){
        return service.paymentInfo_no(id);
    }

    public String paymentInfoTimeoutHandles(Integer id){
        return "线程池： "+Thread.currentThread().getName()+"id:"+id+"我是order补救的方法";
    }
}
