package com.ucas.prms.server.dao.impl;

import org.springframework.stereotype.Repository;

import com.ucas.prms.server.dao.UserDao;
import com.ucas.prms.server.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public User findByLoginNameAndPassword(String loginName, String password) {
		return (User) getSession().createQuery(//
				"FROM User u WHERE u.loginName=? AND u.password=?")//
				.setParameter(0, loginName)//
				.setParameter(1, password)//
				.uniqueResult();
	}
}
