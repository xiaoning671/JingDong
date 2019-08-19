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

    @Override
    public boolean insertUser(User_Info user)
{
    int a=user_infoMapper.insert(user);

    if(a>0)
    {
        System.out.println(a);
        return true;
    }
    else
    {
        System.out.println("错误");
        return false;
    }
}

    @Override
    public int selectUserid(String email) {
        int b=user_infoMapper.selectUser(email);
        System.out.println(b);
        return b;
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
