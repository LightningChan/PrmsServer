package com.ucas.prms.server.dao;

import com.ucas.prms.server.entity.User;


public interface UserDao extends BaseDao<User> {

	public User findByLoginNameAndPassword(String loginName,String password);
}
