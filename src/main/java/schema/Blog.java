package schema;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Blog {
	
	@Id
	private int blogId;
	//@ManyToOne(cascade=CascadeType.ALL)
	private int userId;
	public int getBlogId() {
		return blogId;
	}


	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public StringBuffer getBlogTxt() {
		return blogTxt;
	}


	public void setBlogTxt(StringBuffer blogTxt) {
		this.blogTxt = blogTxt;
	}


	private StringBuffer blogTxt; 
	//private StringBuffer[] tags;
	

	public Blog() {
		// TODO Auto-generated constructor stub
	}

}
