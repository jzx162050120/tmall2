

package com.example.tmall2.mall.service.impl;



import com.example.tmall2.mall.bean.dto.AddOrUpdateProdReq;
import com.example.tmall2.mall.constants.BaseCodeType;
import com.example.tmall2.mall.constants.ResponseObject;
import com.example.tmall2.mall.dao.IProductDAO;
import com.example.tmall2.mall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDAO productDAO;

	@Override
	public ResponseObject addProd(AddOrUpdateProdReq addOrUpdateProdReq) {
		productDAO.insertProd(addOrUpdateProdReq);
		return ResponseObject.getResponseObject(BaseCodeType.SUCCESS);
	}

//	public void deleteProd(int id) {
//		productDAO.deleteProd(id);
//	}
//
//
//
//	public AddOrUpdateProdReq getProd(int id) {
//		return productDAO.findOne(id);
//	}
}