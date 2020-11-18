package com.newland.cloud.springcloudalibabaorder90.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ${linfengpeng}
 * @Title: NacosController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/18 15:38
 */
@RestController
public class NacosController {

    @Autowired
    private RestTemplate restTemplate;

    private final static  String url="http://cloud-payment-nacos";

    @GetMapping(value = "/consumer/get/{id}")
    public String getUrl(@PathVariable("id") Integer id){
        return restTemplate.getForObject(url+"/payment/get/"+id,String.class);

    }
}
