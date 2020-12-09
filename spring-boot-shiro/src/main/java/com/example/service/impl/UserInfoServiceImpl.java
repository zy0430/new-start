package com.example.service.impl;

import com.example.dao.UserInfoDao;
import com.example.model.UserInfo;
import com.example.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        UserInfo userInfo = userInfoDao.findByUsername(username);
        return userInfo;
    }
}
