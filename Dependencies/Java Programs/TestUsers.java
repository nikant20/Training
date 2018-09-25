public class TestUsers{
	public static void main(String[] args){
		UserData userData = new UserData();
		User user = userData.getUserById(101);
		System.out.println(user.getUserId()+ " "+user.getUserName()+ " "+user.getPassword());		
	}
}