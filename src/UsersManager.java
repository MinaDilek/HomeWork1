
public class UsersManager {
	public void add(Users user) {
		System.out.println("kullan�c� eklendi: "+ user.userName);
	}
	
	public void delete(Users user) {
		System.out.println("kullan�c� silindi : " + user.userName);
	}
	
	public Users[] getUsers() {
		Users user1 = new Users();
		user1.userName="ali";
		user1.eMail="ali.y�lmaz@gmaili.com";
		user1.passWord=5793426;
		
		Users user2 = new Users();
		user2.userName="ayse";
		user2.eMail="ayse.svs@gmail.com";
		user2.passWord=5685368;
		
		Users[] users = {user1,user2};
		return users;
		
	}
	

}
 