
public class User {
    private int userId;
    private String userName;
    private String email;
    
    
	private User(UserBuilder userBuilder) {
		super();
		this.userId = userBuilder.userId;
		this.userName = userBuilder.userName;
		this.email = userBuilder.email;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmail() {
		return email;
	}
    
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}



	static class UserBuilder
	{
		private int userId;
		private  String userName;
		private    String email;
		    
		    public UserBuilder()
		    {
		    	
		    }
		    
		    public UserBuilder setId(int id)
		    {
		    	this.userId=id;
		    	return this;
		    }
		    
		    public UserBuilder setUserName(String name)
		    {
		    	this.userName=name;
		    	return this;
		    }
		    
		    public UserBuilder setEmail(String email)
		    {
		    	this.email=email;
		    	return this;
		    }
		    
		    public User build()
		    {
		    	User user=new User(this);
		    	return user;
		    }
	}
    
}
