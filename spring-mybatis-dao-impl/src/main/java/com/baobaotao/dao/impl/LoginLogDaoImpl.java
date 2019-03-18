package com.baobaotao.dao.impl;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.domain.LoginLog;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua[xujiuhuamoney@163.com]
 * @create 2016-09-21-14:28
 */
@Repository("loginLogDao")
public class LoginLogDaoImpl implements LoginLogDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public void insertLoginLog(LoginLog loginLog) {
        sqlSessionTemplate.insert("com.baobaotao.dao.LoginLogDao.insertLoginLog", loginLog);
    }
}
