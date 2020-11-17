package com.newland.cloud.springcloudgetway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ${linfengpeng}
 * @Title: GatewayConfig
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/17 18:32
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouterLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("2020-11-17",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        // 进行转发 此时访问localhost:9527/guonei 会被转发到 baidu.com
        return routes.build();
    }

}
