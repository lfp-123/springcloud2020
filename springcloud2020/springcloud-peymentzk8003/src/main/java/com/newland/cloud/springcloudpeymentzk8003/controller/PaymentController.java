package com.newland.cloud.springcloudpeymentzk8003.controller;




import com.newland.cloud.springcloudcommons.pojo.CommentResult;
import com.newland.cloud.springcloudcommons.pojo.Payment;
import com.newland.cloud.springcloudpeymentzk8003.service.serviceImpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ${linfengpeng}
 * @Title: PaymentController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/13 13:56
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private  String port;
    @PostMapping(value = "/payment/create")
    public CommentResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if(i>0){
            return new CommentResult(200,"插入数据库成功"+port,i);
        }else {
            return new CommentResult(444,"插入数据库失败",null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommentResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPayment(id);
        if(payment!=null){
            return new CommentResult(200,"查询成功"+port,payment);
        }else {
            return new CommentResult(444,"查询失败！！",null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object getService() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("service:" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println("host:" + instance.getHost() + "\t" + "port:" + instance.getPort() + "\t" + "url:" + instance.getUri());

        }
        return this.discoveryClient;
    }
}
