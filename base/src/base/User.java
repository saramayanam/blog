package base;

import java.util.Date;

public class User implements Comparable<User>{
	private int userId;
	private String userName;
	private String userEmail;
	
	public User(int userId, String userName, String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}
	
	public int getuserId() {
		return this.userId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	
	public String getuserName() {
		return this.userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public String getuserEmail() {
		return this.userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		
		if(this.userId > u.getuserId())
			return 1;
		
		if(this.userId < u.getuserId())
			return -1;
		
		if(this.userId == u.getuserId())
			return 0;
		
		return 0;
	}
	
}
