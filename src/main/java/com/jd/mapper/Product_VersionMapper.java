package com.jd.mapper;

import com.jd.enity.Product_Version;

public interface Product_VersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_Version record);

    int insertSelective(Product_Version record);

    Product_Version selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_Version record);

    int updateByPrimaryKey(Product_Version record);
}