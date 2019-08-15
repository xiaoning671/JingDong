package com.jd.mapper;

import com.jd.enity.User_ShopCart;
import org.springframework.stereotype.Repository;

@Repository
public interface User_ShopCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_ShopCart record);

    int insertSelective(User_ShopCart record);

    User_ShopCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_ShopCart record);

    int updateByPrimaryKey(User_ShopCart record);
}