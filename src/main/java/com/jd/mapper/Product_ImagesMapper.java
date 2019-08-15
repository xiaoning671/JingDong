package com.jd.mapper;

import com.jd.enity.Product_Images;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_ImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_Images record);

    int insertSelective(Product_Images record);

    Product_Images selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_Images record);

    int updateByPrimaryKey(Product_Images record);
}