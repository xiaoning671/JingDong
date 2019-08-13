package com.jd.mapper;

import com.jd.enity.Product_Info;

public interface Product_InfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_Info record);

    int insertSelective(Product_Info record);

    Product_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_Info record);

    int updateByPrimaryKey(Product_Info record);
}