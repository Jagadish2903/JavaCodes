package OOPS_AbstractClass;

public abstract class Page { //to make it as a abstract class we need to declare it has abstract keyword here 
	
	//Enhanced Version of interface is called Abstract Class 
	//in Abstarct class we can have Abstract method
	
	//We cannot create a Object for Abstract Class
	//Since we cannot create a object as per the statement we cannot create Constructor of the Abstract Class
	//But in this case we can create Constructor of the Abstract Class
	//To Call Construcator class we need to create a object of the child class
	
	
	
	//public void title();//In abstract class we cannot create a abstract method without abstract keyword 
	//In Interface we can create a Abstarct method with or without abstract keyword 
	//Non abstract methods are allowed but with a method body
	//Non Abstract methods can be static or final 
	
	
	//It is not compulsory to have  abstract method always (In C++ it is compulsory whereas in java it is not )
	//eg.public abstract void title(); can or cannot be there
	//eg2.public abstract void header(); can or cannot be there
	//Abstract class can have 0 Abstract method 
	//Abstract class can have only Abstract methods
	//Abstratc class can have a Partial Abstract methods also 
	
	//Interface should have 100% Abstraction(After 1.8 JDK we can achieve partial abstraction using default keyword)
	//Abstract class can have 0-100% Abstraction
	
	
	
	
	
	
	//Constructor 
	public  Page() {
		System.out.println(" constructor of the class Page ");
	}
	
	//Overloading a Constructor
	
	public Page(int a ) {
		System.out.println(" constructor with Parameter"+ a);
	}
	
	
	
	public abstract void title();
	
	public abstract void header();
	
	//out of below examples of non Abstract methods only timeout can be overridden
	public void timeout() {
		System.out.println("Page Timeout....+20");
	}
	
	public final void logo() {
		System.out.println("Page logo");
	}
	
	public static void url() {
		System.out.println("www.amazon.com");
	}
	
	
	
	
	
	
	
 
	 
	
	
	
	
}
