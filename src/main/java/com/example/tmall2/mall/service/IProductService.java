package com.example.tmall2.mall.service;


import com.example.tmall2.mall.bean.dto.AddOrUpdateProdReq;
import com.example.tmall2.mall.constants.ResponseObject;

/**
 * @Author JinZhuxin
 * @create 2019/11/27 10:10
 */
public interface IProductService {
    public ResponseObject addProd(AddOrUpdateProdReq request);
}
