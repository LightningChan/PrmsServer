package com.ucas.prms.server.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucas.prms.server.dao.UserDao;
import com.ucas.prms.server.entity.User;
import com.ucas.prms.server.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private UserDao userDao;
	

	@Override
	public void save(User user) {
		userDao.save(user);
		logger.info("保存一条用户信息"+user.getName());
	}


	@Override
	public User getById(Long id) {
		return userDao.getById(id);
	}


	@Override
	public List<User> getByIds(Long[] ids) {
		return userDao.getByIds(ids);
	}


	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}


	@Override
	public User login(String loginName, String password) {
		return userDao.findByLoginNameAndPassword(loginName, password);
	}
}
