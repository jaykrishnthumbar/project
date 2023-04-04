package com.example.Springexample.userservice;

import java.util.LinkedList;

import com.example.Springexample.controller.User;

public interface UserService {

	public String addUser(int id, User user);
	public LinkedList<User> allUser();
	public User getUser(int id);
	public User deleteUser(int id);
	public String updateUser(int id, User user);

}
