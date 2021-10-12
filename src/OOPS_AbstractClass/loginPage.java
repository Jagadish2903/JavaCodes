package OOPS_AbstractClass;

public class loginPage extends Page {

	//added unimplemented methods
	@Override
	public void title() {
		System.out.println("Loginpage Title");
		
	}

	@Override
	public void header() {
		System.out.println("Loginpage header");
		
	}//extends the page class(i.e Page is a Parent and Loginpage is a child ....Class to class to used extends keyword

	
	public void dologin() {
		System.out.println("Loginpage login");
	}

	//@Override//to check whether it is overridden
	public void timeout() {
		System.out.println("Login Timeout....+10");
	}
	
	
	
//	public final void login() {
//		System.out.println("Page login");
//	}
	
	
	public static void url() {
		System.out.println("www.flipkart.com");
	}
	
	
	
	//Constructor
	
	public  loginPage() {
		System.out.println(" constructor of the login Page ");
	}
}


