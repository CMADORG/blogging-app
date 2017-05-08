package schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Users")
public class UserSchema {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="userId")
	private int userId;
	private int passwordHash;
	private String userName;
	 


	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public int getPasswordHash() {
		return passwordHash;
	}



	public void setPasswordHash(int passwordHash) {
		this.passwordHash = passwordHash;
	}

	public UserSchema() {
		// TODO Auto-generated constructor stub
	}

	
	
}
