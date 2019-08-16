package com.jd.service;

import com.jd.enity.Product_BigClass;
import com.jd.mapper.Product_BigClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Product_BigClassServiceImpl implements Product_BigClassService {
    @Autowired
    Product_BigClassMapper product_bigClassMapper;
    @Override
    public List<Product_BigClass> getallBigClass() {
        System.out.println("进入Service层");
        List<Product_BigClass> p_all=product_bigClassMapper.getallBigClass();
        for(int i=0;i<p_all.size();i++){
            System.out.println(p_all.get(i));
        }
        return p_all;
    }

    @Override//添加一条类数据  传入一个数据对象
    public boolean add_firstBigClass(Product_BigClass a_kind) {
        int succ=product_bigClassMapper.insert(a_kind);
        System.out.println("success="+succ);
//        if(succ==false)return false;
        return true;
    }

    @Override//删除一条类数据  传入一个对象id
    public boolean del_firstBigClass(Integer del) {
        int result=product_bigClassMapper.deleteByPrimaryKey(del);
        System.out.println(result);
        return true;
    }
}
