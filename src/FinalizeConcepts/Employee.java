package FinalizeConcepts;

public class Employee{

	
	//By deafult Parent of EMployee class is a Object .
	//By default Object Class has a default method called Finalize
	//Finalize method is available in Object Class and we have overridden in our class and this can be called before Garabage collecter is called to destroy the Null reference object and object with no reference
	//to prove the finalize method will be called by default see the below example
	
	@Override //to check whether it is overridden the Object class method
	public void finalize() {
		System.out.println("Finalize method calling .... ");
	}
	
	public static void main(String[] args) {
	
		
		
//		Employee e=new Employee();//Created a Object of Employee Class
//		e=null;//Given the Object reference as null
		
		
		Student s=new Student();//Created a Object of Student Class
		s=null;//Given the referecne as Null
		
		System.out.println("Starting ");
		System.gc();//Calling the Garbage Collector to clean up heap memory
		System.out.println("End ");
		
		
		
		//Employee Object Output :
		
		//here we havent called finalize method but this wwill be called automatically by Java
		//So output will be like Starting....End ....Finally Finalize method calling 
		//End is printed Second coz ...by the time garbage collector is called ..Garbage collector will give signal to JVM and JVM will check Finalize method by the time .. it will print End 
      
		
		//Student Object Output
		//here it will print only starting and End 
		//coz first it will print starting then Gc is called and it will check any finalize method is overridden or there in Student class
		//Since finalize method not there it will print only End 
		//To call finalize method for Student class we have to create a Finalize method in Student Class method 
		
		
		
		//hence its a Class responsibility for a finalize method to be called 
		//we can inherit the finalize method also 
		

		
		//After Java JDK 1.8 Finalize method is depricated nomore in Java  
		
	}

}
