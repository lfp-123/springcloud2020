package com.newland.cloud.springcloudorder.pojo;

/**
 * @author ${linfengpeng}
 * @Title: CommertResult
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/12 17:23
 */
public class CommentResult<T>  {
    private Integer code;
    private String message;
    private T data;

    public CommentResult(Integer code,String message){
        this(code,message,null);
    }
    public CommentResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommentResult(Integer code, String message, T data) {

        this.code = code;
        this.message = message;
        this.data = data;
    }
}
