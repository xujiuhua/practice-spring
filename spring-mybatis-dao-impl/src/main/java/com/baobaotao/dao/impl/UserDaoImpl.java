package com.baobaotao.dao.impl;

import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua[xujiuhuamoney@163.com]
 * @create 2016-09-21-13:41
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int getMatchCount(String userName, String password) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("userName", userName);
        map.put("password", password);
        return sqlSessionTemplate.selectOne("com.baobaotao.dao.UserDao.getMatchCount", map);
    }

    @Override
    public User findUserByUserName(String userName) {
        return sqlSessionTemplate.selectOne("com.baobaotao.dao.UserDao.findUserByUserName", userName);
    }

    @Override
    public void updateLoginInfo(User user) {
        sqlSessionTemplate.update("com.baobaotao.dao.UserDao.updateLoginInfo", user);
    }
}
