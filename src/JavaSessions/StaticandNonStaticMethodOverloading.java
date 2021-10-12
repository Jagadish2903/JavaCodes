package JavaSessions;

public class StaticandNonStaticMethodOverloading {
  //Note: Static Variable/Static method is stored in Common Memmory allocation
	//Non Static Method/Non Static variable is stored in Heap memmory
	//in Stack memmory Object reference is stored.
	
	
	public void getname() {
		System.out.println("Hi Jaggu");
	}
	
	public static void getage() {
		System.out.println("29");
	}
	
	
	public static void main(String[] args) {
	
		//To call the non Static method we need to create Object
		
		//To create a Object
		StaticandNonStaticMethodOverloading obj=new StaticandNonStaticMethodOverloading();
		obj.getname();//it calls the non static method 
		
		//to call the Static method
		StaticandNonStaticMethodOverloading.getage();//using class name
		obj.getage();//another way but not recommended it will show warning 
		getage(); //calling directly
		
		//Create a Class of A and B with both static main method 
		//call A Class from B and B Class from A
		//It will show the Stackoverflow error 
		
		
		
		
		
		

	}

}
