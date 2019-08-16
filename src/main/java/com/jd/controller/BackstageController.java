package com.jd.controller;

import com.jd.enity.Product_BigClass;
import com.jd.service.Product_BigClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
public class BackstageController {
    @Autowired
    Product_BigClassService product_bigClassService;
    @RequestMapping("/backstage_getBigClass")
    public List<Product_BigClass> getAllBigClass(){
        return product_bigClassService.getallBigClass();
    }
//    @RequestMapping("/backstage_getBigClass_revise")
//    public boolean getBigClass_revise(){
//        return product_bigClassService.
//    }
    @RequestMapping("/backstage_add_firstBigClass")
    public boolean add_firstBigClass(Product_BigClass a_kind){
//        System.out.println(a_kind);
        return product_bigClassService.add_firstBigClass(a_kind);
    }
    @RequestMapping("/backstage_del_firstBigClass")
    public boolean del_firstBigClass(int del){
        return product_bigClassService.del_firstBigClass(del);
    }
}
