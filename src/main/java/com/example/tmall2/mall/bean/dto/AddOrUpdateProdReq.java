package com.example.tmall2.mall.bean.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @Author JinZhuxin
 * @create 2019/11/29 11:06
 */
@Data
public class AddOrUpdateProdReq {
    private Integer id;
   @NotBlank(message = "无效参数：name")
    private String name;

    private String subTitle;

    @NotBlank(message = "无效参数：originalPrice")
    private float originalPrice;

    @NotBlank(message = "无效参数：promotePrice")
    private float promotePrice;

    @NotBlank(message = "无效参数:stock")
    private int stock;

    @NotBlank(message = "无效参数：cid")
    private Integer cid;
    private Date createDate;


}