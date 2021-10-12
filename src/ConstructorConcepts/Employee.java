package ConstructorConcepts;

public class Employee {
	
	//Constructor is having same name as Class name
	//Constructor doesnt have return type(so no void/no return)(even if we write void its ok)
	//But Functions may or may not return depends on void declaration 
	//Constructor can be Overloaded
	//Functions can be called by creating a object and with object reference we can call functions
	//whereas constructor will be called when we create a object of that class
	//Constructor will restrict user for creating unnecessary objects 
	//constructor will act as setter 
	//Constructor wull help to create a type of object
	//Buiseness logic/feature should be written inside the functions only not in constructors
	//Constructors can be public/Private/Protected (but in real time we wont use 
	//Constructor can also participate to achieve encapsulations by creating a setter to access private variables.
	//if we use constructor there will be no need to create a setter since it acts as setter itself but to update any value in testclass we need setter even if constructor is present
	//but we need getter to get the values
	//Creating a private constructor will not allow user to create a object at all (Use case :incase if a developer wants to develop a code but suddenly they want deployement so he will apply tat constructor in private so tat user wont create object for that class
	
	
	
	public Employee() {//basic Constructor ie it has same name as class name 
		System.out.println("hi i am base constructor");
		
	}
	public Employee(int a) {//Constructor Overloaded by adding a Parameters
		System.out.println(" Hi i am first Constructor");
	}
	
	public Employee(String a,int b) {//Constructor Overloaded by adding a Parameters
		System.out.println(" Hi i am Second Constructor");
		
	}
	
	public static void main(String args[]) {
		//Employee obj=new Employee();// this will call the base constructor directly by the objects itself
		//Employee obj=new Employee(10);//this will call the first constructor directly by the objects itself
		Employee obj=new Employee("Jaggu" , 10);//this will call the Second constructor directly by the objects itself
       
		//The moment we create a object it calls the respective constructor
		//if we use the object reference to call its called functions
		
		
		
	}
	
}
