package com.newland.cloud.springcloudhystrixorder80.exception;

import com.newland.cloud.springcloudhystrixorder80.service.HystrixService;
import org.springframework.stereotype.Service;

/**
 * @author ${linfengpeng}
 * @Title: Fallbackmethod
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/17 10:05
 */
@Service
public class Fallbackmethod implements HystrixService {


    @Override
    public String paymentInfo_ok(Integer id) {
        return "我是全局order补救的方法";
    }

    @Override
    public String paymentInfo_no(Integer id) {
        return "我是全局order补救的方法";
    }
}
