package OOPS_AbstractClass;

public class testPage {

	public static void main(String[] args) {
		loginPage lp=new loginPage();
		lp.title();//overridden method
		lp.header();//overridden method
		lp.dologin();//Individual method
		lp.timeout();//overridden method
		lp.url();
		
		
		//TopCasting with Abstract Classes(Page)		
		Page pa=new loginPage();		
		pa.title();
		pa.header();
		pa.timeout();
		pa.url();
		
		//pa.dologin();//cannot access this method cox its a individual method available in loginpage and it will apply a reference check will be applied 
			
		
		//Downcasting is not allowed cox abstract class cannot create object 
		//loginpage lp1=new Page();
		


		
		//Calling Constructors
		//To Call Construcator class we need to create a object of the child class
		loginPage lp2=new loginPage();
		//immediately wen we create a object of the child class it will create a default constrctot in Loginpage(Child Class) and then it will check for Page Class whether default is available 
		//if yes it will print tat		
		//if default constructor is present in the loginpage it will print tat matching parameters 
		//loginPage lp3=new loginPage(10);//this will throw error since parameters for cnstructor is not defined in Loginpage	
		//when default constructor is defined in both the Page Class and loginPage ..it will call both but first it will print parent class constructor then child constructor 
		//
		
		
		
		
		
		
	

	}
	
	
	

}
