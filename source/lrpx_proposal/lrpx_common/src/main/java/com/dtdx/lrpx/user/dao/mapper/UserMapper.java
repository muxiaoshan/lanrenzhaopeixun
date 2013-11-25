package com.dtdx.lrpx.user.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dtdx.lrpx.user.domain.User;
@Repository
public interface UserMapper {   
    public void insertUser(User user);   
  
    public User getUser(String name);  
    
    List<User> queryUserList();
}  
