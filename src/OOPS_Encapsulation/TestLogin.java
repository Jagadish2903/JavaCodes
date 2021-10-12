package OOPS_Encapsulation;

public class TestLogin {

	public static void main(String[] args) {
	  //Creating object to access Loginpage class
		
		LoginPage obj=new LoginPage();
		obj.setUsername("Jaggu");
        obj.setPassword("Jaggulav");
    System.out.println(obj.getUsername());//this will get username
    System.out.println(obj.getPassword());//this will get password
    
    obj.dologin(obj.getUsername(), obj.getPassword());//calling other method 
    
    //2nd User
    LoginPage obj1=new LoginPage();
    obj1.setUsername("Lav");
    obj1.setPassword("Lavjag");
System.out.println(obj1.getUsername());//this will get username
System.out.println(obj1.getPassword());//this will get password

obj.dologin(obj1.getUsername(), obj1.getPassword());//calling other method 
    


	
//to update password lastmin this is the advantage we can 
	 obj.setPassword("Jaggulav123");
	 
	 obj.dologin(obj.getUsername(), obj.getPassword()); 
	 
	 
	}
	 
}
