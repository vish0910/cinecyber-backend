package com.vdoshi3.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.vdoshi3.database.UserDatabase;
import com.vdoshi3.entity.User;
@Service
public class UserService implements IUserService{
	static Map<String, User> users = (ConcurrentHashMap<String, User>)UserDatabase.getUsers();
	
	@Override
	public User create(User user) {
		users.put(user.getUserid(), user);
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> find(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
