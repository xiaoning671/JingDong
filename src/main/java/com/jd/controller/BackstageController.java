package com.jd.controller;

import com.jd.enity.Product_BigClass;
import com.jd.service.Product_BigClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BackstageController {
    @Autowired
    Product_BigClassService product_bigClassService;
    @RequestMapping("/backstage_getBigClass")
    public List<Product_BigClass> getBigClass(){

        return product_bigClassService.getBigClass();
    }
}
