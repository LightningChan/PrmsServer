package com.ucas.prms.server.service;

import java.util.List;

import com.ucas.prms.server.entity.User;

public interface UserService {

	public void save(User user);
	
	public User getById(Long id);
	
	public List<User> getByIds(Long[] ids);
	
	public List<User> findAll();
	
	public User login(String loginName,String password);
	
}
