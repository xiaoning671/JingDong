package com.jd.mapper;

import com.jd.enity.Product_SmallClass;

public interface Product_SmallClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_SmallClass record);

    int insertSelective(Product_SmallClass record);

    Product_SmallClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_SmallClass record);

    int updateByPrimaryKey(Product_SmallClass record);
}