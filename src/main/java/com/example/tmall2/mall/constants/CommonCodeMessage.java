package com.example.tmall2.mall.constants;

import lombok.Data;

/**
 * @Author JinZhuxin
 * @create 2019/11/27 15:25
 */
@Data
public class CommonCodeMessage {
    private String code;
    private String message;
    public CommonCodeMessage(String code,String message){
        this.code=code;
        this.message=message;
    }
}
