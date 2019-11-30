
package com.example.tmall2.mall.controller;



import com.example.tmall2.mall.bean.dto.AddOrUpdateProdReq;
import com.example.tmall2.mall.constants.ResponseObject;
import com.example.tmall2.mall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;
 
@RestController
@RequestMapping(value = "/prod")
public class ProductController {
	@Autowired
    private IProductService productService;


    
    @RequestMapping(value = "/addAndUpdate",method = RequestMethod.POST)
    public ResponseObject addAndUpdate(@Valid @RequestBody AddOrUpdateProdReq prod, HttpServletRequest httpRequest)  {
    	prod.setCreateDate(new Date());
        return productService.addProd(prod);
    }
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello ";
    }
    
    
    


}


