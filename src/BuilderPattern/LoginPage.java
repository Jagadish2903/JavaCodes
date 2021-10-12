package BuilderPattern;

public class LoginPage {
	
	private String Username;
	private String Password;
	
	//Creating getter and Setter and a Constructor 
	
	//Constructor
	public LoginPage(String username, String password) {
		Username = username;
		Password = password;
	}
	
	//Getter and Setter
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

	//Creating a separate method
	
	public void doLogin(LoginPage lp) {//Passing the input as a Class object reference 
		//This is called as Call by reference
		//here exactly new LoginPage() is a object
		//login is a object reference for it 
		//lp is the another reference of LoginPage object as well
		//hence an object can have multiple object reference.
		//i.e lp and login are reference of loginpage object
		
		
		lp.getUsername();
		lp.getPassword();
		
		System.out.println("Login USing "+(lp.getUsername())+" "+(lp.getPassword()));
		
	}
	
	
	

}
