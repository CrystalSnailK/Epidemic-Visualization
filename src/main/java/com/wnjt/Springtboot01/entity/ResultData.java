package com.wnjt.Springtboot01.entity;

/*
对结果进行封装  ResultData 对象
 */
public class ResultData {
    //状态码
    private Integer code;
    //信息
    private String message;
    //结果
    private Object data;//这些是对象
//shift+insert

//构造函数

    public ResultData() {
    }

    public ResultData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData(Integer code, String message) {
        this.code = code;
        this.message = message;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
