package com.imooc.user.service;

import com.imooc.mapper.UserMapper;
import com.imooc.thrift.user.UserInfo;
import com.imooc.thrift.user.UserService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nnkwrik
 * 18/08/27 22:32
 */
@Service
public class UserServiceImpl implements UserService.Iface {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserInfoById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public UserInfo getTeacherById(int id) {
        return userMapper.getTeacherById(id);
    }

    @Override
    public UserInfo getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public void registerUser(UserInfo userInfo) {
        userMapper.registerUser(userInfo);
    }


}
