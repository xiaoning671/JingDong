package com.jd.controller;

import com.jd.enity.Address_Info;
import com.jd.enity.Product_Version;
import com.jd.enity.User_Info;
import com.jd.service.Address_InfoService;
import com.jd.service.Product_VersionService;
import com.jd.service.UserService;
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
    @Autowired
    UserService userService;

    @RequestMapping("/api/order/commit/info")
    public List<Product_Version> shopcartCommit(int userid){
        //提交参数为购物车id列表，返回值为商品版本信息(附带图片)
        return product_versionService.getPVersionById(userid);
    }
    @RequestMapping("/api/order/commit/img")
    public List<String> shopCartCommitGetImgUrl(){
        //提交参数为购物车id列表，返回值为商品图片URL
        List<Integer> test = new ArrayList<>();
        test.add(1);
        return product_versionService.getImgUrlByID(test);
    }
    @RequestMapping("/api/order/commit/address")
    public Address_Info getAddressByUserId(int id){
        //提交值为userid,返回值为地址信息列表
        return address_infoService.getAllAddressByUserId(id).get(1);
    }
    @RequestMapping("/api/getUserInfo")
    public User_Info getUserInfo(int id){
        return userService.getUserInfo(id);
    }
}
