package com.jd.service;

import com.jd.enity.Product_BigClass;
import com.jd.mapper.Product_BigClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Product_BigClassServiceImpl implements Product_BigClassService {
    @Override
    public List<Product_BigClass> getBigClass() {
        return null;
    }
//    @Autowired
//    Product_BigClassMapper product_bigClassMapper;
//    @Override
//    List<Product_BigClass> getBigClass() {
//        return product_bigClassMapper.getall_bigclass;
//    }
}
