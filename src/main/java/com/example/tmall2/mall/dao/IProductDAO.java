
package com.example.tmall2.mall.dao;


import com.example.tmall2.mall.bean.dto.AddOrUpdateProdReq;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductDAO {
		/**
		*@Description插入产品信息
		*@Param
		*@Return
		*@Author JinZhuxin
		*@Date 2019/11/27
		*@Time 16:39
		*/
	public int insertProd(AddOrUpdateProdReq addOrUpdateProdReq);


}

