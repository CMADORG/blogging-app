package data;

import blogexceptions.DuplicateUserException;
import schema.UserSchema;

public interface UserDAO {
	
	public boolean addUser(UserSchema u) throws DuplicateUserException;
	public int findUser(String name);
}
