package com.jd.service;

import com.jd.enity.User_Info;

public interface UserService {
    public boolean checkUser(User_Info user);
//    public User_Info test(int i);

    public boolean insertUser(User_Info user);
    public int selectUserid(String email);
}
