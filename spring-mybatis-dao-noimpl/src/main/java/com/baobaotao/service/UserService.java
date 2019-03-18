package com.baobaotao.service;

import com.baobaotao.domain.User;

/**
 * @author jiuhua.xu
 */
public interface UserService {

	/**
	 * 匹配用户名和密码
	 *
	 * @param userName
	 * @param password
	 * @return
	 */
	boolean hasMatchUser(String userName, String password);

	/**
	 * 通过username查找用户
	 *
	 * @param userName
	 * @return
	 */
	User findUserByUserName(String userName);

}
