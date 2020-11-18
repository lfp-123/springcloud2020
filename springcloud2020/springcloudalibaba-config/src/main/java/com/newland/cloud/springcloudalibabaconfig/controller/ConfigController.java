package com.newland.cloud.springcloudalibabaconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${linfengpeng}
 * @Title: ConfigController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/18 16:29
 */
@RestController
@RefreshScope //支持动态刷新功能
public class ConfigController {
    @Value("${config.info}")
    private String config;

    @GetMapping("/config/info")
    public String getConfig(){
        return config;
    }
}
