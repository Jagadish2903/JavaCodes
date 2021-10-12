package JavaSessions;

public class MethodOverloadParent {

	
//Method Overloading conditions
	//1.with Same name
	//2.with Different Parameters
	//3.with number of parameters
	//4.Sequence of parameters should be different
	//hence it is called Compiletime Polymorphism(Static polymorphism) cox on the basis of calling of parameters it is decided at the compile time
	//Polymorphism---poly- many/morphism --forms
	
	
	public void login() {
	System.out.println("Login");
	}
	
	public void login(String username, String Password) {
	System.out.println("login with " +" "+username+" "+Password);//Username and Password is called parameters
	}
	
	public void login(String username, String Password  ,String roll) {
	System.out.println("login with " +" "+username+Password+roll);
	}
	
	public void login(String username, String Password  ,int OTP) {
		System.out.println("login with " +" "+username+Password+OTP);
		}
	
	public void login(long phoneno, int OTP) {
		System.out.println("login with " +" "+phoneno+OTP);
		}
	
	
	public static void main(String[] args) {
	
		MethodOverloadParent obj2=new MethodOverloadParent();
		obj2.login("Jaggu", "Lavjag");//It is called Arguments
		
		obj2.login("9870000", "222");
		
		
	}
	
}