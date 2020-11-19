package com.newland.cloud.springcloudalibabasentinelservice;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author ${linfengpeng}
 * @Title: Exception
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/19 15:14
 */
public class myException {
    public String exceptionHandle1(BlockException e){

        return "this is one diy exception !!";
    }

    public String exceptionHandle2(BlockException e){
        return "this is two diy exception !!";
    }
}
