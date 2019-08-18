package com.jd.service;

import com.jd.enity.User_Info;
import com.jd.mapper.User_InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    User_InfoMapper user_infoMapper;
    @Override
    public User_Info checkUser(User_Info user) {
        User_Info own=user_infoMapper.checkByName_Password(user);
        return own;
    }

    @Override
    public User_Info getUserInfo(int id) {
        return user_infoMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<User_Info> getAllUser(){
        return  user_infoMapper.getAllUser();
    }

    @Override
    public boolean del_user(int del) {
        if(user_infoMapper.deleteByPrimaryKey(del)==1)return  true;
        return false;
    }

    @Override
    public boolean add_user(User_Info add) {
        if(user_infoMapper.insert(add)==1)return true;
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
