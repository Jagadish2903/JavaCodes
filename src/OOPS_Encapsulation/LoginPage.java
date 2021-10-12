package OOPS_Encapsulation;

public class LoginPage {

	private String Username;
	private String Password;
	
	//getting getter and Setter for above private variable
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
	
	public void dologin(String un,String pwd) {
		System.out.println(un+" "+pwd);
	}
	
	
	
	
	
}
