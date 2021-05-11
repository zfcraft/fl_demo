package com.fulan.server.enums;

/**
 * Created by Administrator on 2017/12/12.
 */
public enum ResultEnum {
     JOBNUMER_OR_IDCARD_NULL(101,"身份证"),
     JOBNUMER_OR_IDCARD_ERROR(102,"护照"),
     PARAMETER_ERROR(103,"企业代码"),
     FILE_IS_NOT_EXCEL(104,"营业执照"),
     DATA_IS_NULL(105,"法人证书");
     Integer code;
     String message;
    ResultEnum(Integer code, String message){
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
}
