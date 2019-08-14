package com.jd.controller;

import com.jd.enity.Address_Info;
import com.jd.enity.Product_Version;
import com.jd.service.Address_InfoService;
import com.jd.service.Product_VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    Product_VersionService product_versionService;
    @Autowired
    Address_InfoService address_infoService;

    @RequestMapping("/api/order/commit/info")
    public List<Product_Version> shopcartCommit(List<Integer> list){
        //提交参数为购物车id列表，返回值为商品版本信息
        return product_versionService.getPVersionById(list);
    }
    @RequestMapping("/api/order/commit/img")
    public List<String> shopCartCommitGetImgUrl(List<Integer> list){
        //提交参数为购物车id列表，返回值为商品图片URL
        return product_versionService.getImgUrlByID(list);
    }
    @RequestMapping("/api/order/commit/address")
    public List<Address_Info> getAddressByUserId(){
        return address_infoService.getAllAddressByUserId(1);
    }

}
