public class UserData{
	public User[] getUsers(){
		User u1 = new User(101, "Nikant", "1234");
		User u2 = new User(102, "Prabhudeep", "4567");
		User u3 = new User(103, "Amulya", "8910");
		User[] userArray = {u1,u2,u3};
		return userArray;
	}
	public User getUserById(int id){
		User user = null;
		User[] allUsers = getUsers();
		for(User u : allUsers){
			if(u.getUserId()==id){
				user = u;
			}	
		}
		return user;
	}
}