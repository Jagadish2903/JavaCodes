package OOPS_Inheritance;

public class Venue extends Car {//used extends keyword to inherit the property of car (means Car is a parent and Venue is a Child)
	
	//@Override //This annotation helps to tell whther method is overridden //and is always a good practice to write to let user know its over ridden

	public void start() {
		System.out.println("Venue AutoStart");
	}
      
	//@Override	//if the method is not overridden it will throw error 
	public void autoparking() {
		System.out.println("Venue autoparking");
	}
    
	//Method Overridden:
	//When you have a method in parent class and the same method in child class with
	//1.same method name
	//2.same parameters +Same sequence of Parameters +Same Type of Parameters
	//3.Same return Type
	//This is also called as Run Time Polymorphism because in this case Car class also have a Start method and Venue class also have Start method
	//compiler wont decide which one to call overridden method will be called in runtime only 
	//also called Dynamic polymorphism
	//Compared to performance method overloading is faster cox it decides in compile time itself 
	//Final methods cannot be overridden (i.e if we write final in car  class start method it will throw error in venue class  start method that it cannot be overridden)
	//final class cannot be inherited (i.e if we write final in the Car class it will throw error in Venue class that it cannot be inherited)
	//final methods can be overloaded 
	//Static methods cannot be overridden but child can have the same method as parent method and is called Method Hiding
	//Static methods can be overloaded
	 //Static method can be inherited(i.e if we create a static method for Car class and call using Venue class object reference it inherits Car)
	
	//there is no such thing called variable overloading or variable overriding
	
	
	
}
