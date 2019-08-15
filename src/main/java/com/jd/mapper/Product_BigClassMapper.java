package com.jd.mapper;

import com.jd.enity.Product_BigClass;

import java.util.List;

public interface Product_BigClassMapper {
    List<Product_BigClass> getall_bigclass();

    int deleteByPrimaryKey(Integer id);

    int insert(Product_BigClass record);

    int insertSelective(Product_BigClass record);

    Product_BigClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_BigClass record);

    int updateByPrimaryKey(Product_BigClass record);
}