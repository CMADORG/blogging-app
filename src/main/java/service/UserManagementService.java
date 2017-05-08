package service;

import api.User;
import api.UserManagementApi;
import blogexceptions.DuplicateUserException;
import blogexceptions.InvalidParameterException;
import blogexceptions.InvalidUserException;
import data.JPAUserDAO;
import data.UserDAO;
import schema.UserSchema;


public class UserManagementService implements UserManagementApi {
	
	UserDAO udao = new JPAUserDAO();
	

	public UserManagementService() {
		// TODO Auto-generated constructor stub
	}

	public void addUser(User u) throws InvalidParameterException, DuplicateUserException {
		
		if(u.getUserName() == null || u.getPassword() == null)
		{
			throw new InvalidParameterException("User name or password is null");
		}
		else
		{
			UserSchema us = new UserSchema();
			us.setUserName(u.getUserName());
			us.setPasswordHash(generatePasswordHash(u.getPassword()));
			udao.addUser(us);
			
		}
		
	}

	public String loginUser(User u) throws InvalidUserException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(User u) throws InvalidUserException {
		// TODO Auto-generated method stub
		
	}

	public User readUser(int userId) throws InvalidUserException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public int readUser(String u)
	{
		return udao.findUser(u);
	}

	public void updateUser(User u) throws InvalidUserException {
		// TODO Auto-generated method stub
		
	}
	
	public int generatePasswordHash(String password)
	{
		return password.charAt(0);
	}

}
