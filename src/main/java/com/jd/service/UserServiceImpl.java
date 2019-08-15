package com.jd.service;

import com.jd.enity.User_Info;
import com.jd.mapper.User_InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    User_InfoMapper user_infoMapper;
    @Override
    public boolean checkUser(User_Info user) {
        int own;
        own=user_infoMapper.checkByName_Password(user);
        System.out.println(own);
        if(own>=1)
        return true;
        return false;
    }

//    @Override
//    public User_Info test(int i) {
//        System.out.println(user_infoMapper.selectByPrimaryKey(i));
//        return  user_infoMapper.selectByPrimaryKey(i);
//    }
//    @Override
//    public User_Info test(int i) {
//        User_Info user=user_infoMapper.select_id(i);
//        System.out.println(user);
//        return user;
//    }
}
