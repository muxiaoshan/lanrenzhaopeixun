package com.dtdx.lrpx.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtdx.lrpx.user.dao.mapper.UserMapper;
import com.dtdx.lrpx.user.domain.User;
import com.dtdx.lrpx.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

	public User getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> queryUserList() {
		return userMapper.queryUserList();
	}

}
