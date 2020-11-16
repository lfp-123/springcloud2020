package com.newland.cloud.springcloudorderopenfen;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ${linfengpeng}
 * @Title: OpenFeignConfiguration
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/16 16:57
 */
@Configuration
public class OpenFeignConfiguration {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}


