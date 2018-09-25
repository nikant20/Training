public class User{
	private int userId;
	private String username;
	private String password;
	
	public User(int userId, String username, String password){
		this.userId = userId;
		this.username  = username;
		this.password = password;
	}
	public int getUserId(){
		return userId;
	}
	public String getUserName(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(){
		this.password = password;
	}
}















