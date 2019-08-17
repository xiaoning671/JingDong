package com.jd.service;

import com.jd.enity.Order_Info;
import org.springframework.stereotype.Service;

@Service
public interface Order_InfoService {
    public boolean createOrder(Order_Info order_info);
}
