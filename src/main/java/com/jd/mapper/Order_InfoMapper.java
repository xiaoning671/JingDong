package com.jd.mapper;

import com.jd.enity.Order_Info;

public interface Order_InfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_Info record);

    int insertSelective(Order_Info record);

    Order_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_Info record);

    int updateByPrimaryKey(Order_Info record);
}