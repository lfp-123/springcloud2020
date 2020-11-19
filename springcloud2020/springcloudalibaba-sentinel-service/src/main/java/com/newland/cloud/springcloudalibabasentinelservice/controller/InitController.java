package com.newland.cloud.springcloudalibabasentinelservice.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author ${linfengpeng}
 * @Title: InitController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/19 10:08
 */
@RestController
public class InitController {

    @GetMapping("/sentinel/geta")
    public String TestA(){
        return "test is A";
    }


    @GetMapping("/sentinel/getb")
    public String TestB(){
        return "test is B";
    }


    @GetMapping("/testD")
    @SentinelResource(value = "hotkey",blockHandler = "dealFilue")
    public String testD(@RequestParam(value = "p1",required = false)String p1,
                        @RequestParam(value = "p2",required = false)String p2){

         //   int i = 10/0;
       // return " ----- testD";
        return "this a success question----";
    }

    public String dealFilue(String p1 , String p2, BlockException e){
        return "this is a error question ---";
    }
}
