package BuilderPattern;

public class TestLogin {

	public static void main(String[] args) {
		//Creating a object to access methods in LoginPage class
		
		//LoginPage login=new LoginPage();//since we used Constructor it will throw error 
		

		LoginPage login=new LoginPage("Jaggu","Jaggu@123");
		
		login.doLogin(login);//passing the object reference as a input
		
		
		
		
	}

}
