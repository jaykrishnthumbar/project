package com.example.Springexample.userservice;

import java.util.HashMap;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.example.Springexample.controller.User;

@Service
public class UserServiceimpl implements UserService {

	HashMap<Integer, User> map = new HashMap<Integer, User>();

	@Override
	public String addUser(int id, User user) {
		map.put(id, user);
		return "Added Successfullyy...";
	}

	@Override
	public LinkedList<User> allUser() {
		return new LinkedList<>(map.values());
	}

	@Override
	public User getUser(int id) {
		return map.get(id);
	}

	@Override
	public User deleteUser(int id) {
		return map.remove(id);
	}

	@Override
	public String updateUser(int id, User user) {
		User u = map.get(id);
		if (u == null) {
			return "Not found...";
		}
		map.replace(id, user);

		return "Updated Successfully....";
	}

}
