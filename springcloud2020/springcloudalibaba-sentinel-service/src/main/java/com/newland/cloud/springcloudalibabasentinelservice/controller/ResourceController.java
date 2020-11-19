package com.newland.cloud.springcloudalibabasentinelservice.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.newland.cloud.springcloudalibabasentinelservice.myException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${linfengpeng}
 * @Title: ResourceController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/19 15:14
 */
@RestController
public class ResourceController {

    @GetMapping("/rest/testA")
    @SentinelResource(value = "byUrl",
            blockHandlerClass = myException.class,
            blockHandler = "exceptionHandle2")
    public String testA(@RequestParam(value = "e",required = false) BlockException e){
        return "this is faker method success";
    }
}
