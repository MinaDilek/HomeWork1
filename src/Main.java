
public class Main {

	public static void main(String[] args) {
		UsersManager userManager = new UsersManager();
		Users user = new Users();
		user.userName="mina";
		user.eMail="mina.dilek@etiya.com";
		user.passWord=789456;
		
		userManager.add(user);
		userManager.delete(user);
		
		
		Users[] result1= userManager.getUsers();
		for(Users userItem : result1) {
			System.out.println(userItem.userName);
		}
		
		
		

	}

}
