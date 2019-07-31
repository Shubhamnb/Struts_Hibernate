package com.bridge.dao;

import com.bridge.pojo.User;

public interface IDao {
	boolean register(User user);
	boolean login(String email,String password);
}
