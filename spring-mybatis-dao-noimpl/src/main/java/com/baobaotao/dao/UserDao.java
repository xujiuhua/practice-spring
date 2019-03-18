package com.baobaotao.dao;

import com.baobaotao.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

	/**
	 * 通过用户名和密码获取用户数量
	 *
	 * @param userName username
	 * @param password password
	 * @return
	 */
	int getMatchCount(@Param("userName")String userName, @Param("password")String password);

	/**
	 * 通过用户名获取用户
	 *
	 * @param userName
	 * @return
	 */
	User findUserByUserName(final String userName);

}
