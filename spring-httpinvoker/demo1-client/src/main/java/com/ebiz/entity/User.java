package com.ebiz.entity;

import java.io.Serializable;

/**
 * @author xujiuhua
 * @date 2016-12-26
 */
public class User implements Serializable{

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
