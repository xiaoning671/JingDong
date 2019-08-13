package com.jd.mapper;

import com.jd.enity.Product_BigClass;

public interface Product_BigClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_BigClass record);

    int insertSelective(Product_BigClass record);

    Product_BigClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_BigClass record);

    int updateByPrimaryKey(Product_BigClass record);
}