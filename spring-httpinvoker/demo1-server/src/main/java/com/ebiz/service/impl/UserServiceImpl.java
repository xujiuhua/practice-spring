package com.ebiz.service.impl;

import com.ebiz.entity.User;
import com.ebiz.service.UserService;

/**
 * @author xujiuhua
 * @date 2016-12-26
 */
public class UserServiceImpl implements UserService{

    @Override
    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return user;
    }
}
