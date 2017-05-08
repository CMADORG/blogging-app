package api;

import blogexceptions.InvalidParameterException;
import blogexceptions.InvalidUserException;


public interface UserManagementApi {
	
	public void  addUser(User u) throws InvalidParameterException;
	public String loginUser(User u) throws InvalidUserException;
	public void  deleteUser(User u) throws InvalidUserException;
	public User readUser(int userId) throws InvalidUserException; 
	public void updateUser(User u) throws InvalidUserException;
}
