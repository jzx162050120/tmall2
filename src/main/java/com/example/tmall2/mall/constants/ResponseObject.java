package com.example.tmall2.mall.constants;

import lombok.Data;

/**
 * @Author JinZhuxin
 * @create 2019/11/27 15:14
 */
@Data
public class ResponseObject {
    private String code;
    private String message;
    private Object data;

    private ResponseObject (CommonCodeMessage codeMessage){
        this.code=codeMessage.getCode();
        this.message=codeMessage.getMessage();
    }

    private ResponseObject(String code,String message,Object data){
        this.code=code;
        this.message=message;
        this.data=data;
    }

    public static ResponseObject getResponseObject(CommonCodeMessage codeMessage){
        return new ResponseObject(codeMessage);
    }

    public static ResponseObject getResponseObject(String code,String message,Object data){
        return new ResponseObject(code,message,data);
    }

    public static ResponseObject getResponseObjcet(CommonCodeMessage codeMessage,Object data){
        if(null==data){
            throw new NullPointerException("数据体不能为空");
        }
        ResponseObject result=getResponseObject(codeMessage);
        result.data=data;
        return result;
    }

    public static ResponseObject successful(){
        return getResponseObject(BaseCodeType.SUCCESS);
    }

    public static ResponseObject error(){
        return getResponseObject(BaseCodeType.ERROR);
    }




}
