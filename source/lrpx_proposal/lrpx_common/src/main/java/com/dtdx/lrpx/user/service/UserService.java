package com.dtdx.lrpx.user.service;

import java.util.List;

import com.dtdx.lrpx.user.domain.User;

public interface UserService {

	public void insertUser(User user);   
	  
    public User getUser(String name);
    
    List<User> queryUserList();
}
