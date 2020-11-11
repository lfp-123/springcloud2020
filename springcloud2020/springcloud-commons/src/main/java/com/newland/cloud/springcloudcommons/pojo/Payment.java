package com.newland.cloud.springcloudcommons.pojo;

import java.io.Serializable;

/**
 * @author ${linfengpeng}
 * @Title: Payment
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/12 17:19
 */
public class Payment implements Serializable{
    private Long id;
    private String serial;

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Payment(Long id, String serial) {

        this.id = id;
        this.serial = serial;
    }
}
