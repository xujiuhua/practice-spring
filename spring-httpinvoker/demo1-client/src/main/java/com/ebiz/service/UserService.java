package com.ebiz.service;

import com.ebiz.entity.User;

/**
 * @author xujiuhua
 * @date 2016-12-26
 */
public interface UserService {
    /**
     * get user by username
     * @param username
     * @return
     */
    User getUser(String username);
}
