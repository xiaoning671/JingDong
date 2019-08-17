package com.jd.service;

import com.jd.enity.Order_Info;
import com.jd.mapper.Order_InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Order_InfoServiceImpl implements Order_InfoService {

    @Autowired
    Order_InfoMapper order_infoMapper;

    @Override
    public boolean createOrder(Order_Info order_info) {
        int i = order_infoMapper.insert(order_info);
        if(i == 1){
            return true;
        }else{
            return false;
        }
    }
}
