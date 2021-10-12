package JavaSessions;

public class MethodOverloadingBasics {

	public static void main(String[] args) {//main method should not return anything tats y void 
		//To Call the non -Static method from static we need to create obj using class
		//to call the test() we need to create object using class(since Test() is non static)
		
		//1Calling 1st method
		
		MethodOverloadingBasics obj1=new MethodOverloadingBasics();
		obj1.test();//calling the test method using object
		
		//2Calling second method
		obj1.test1();
		String s=obj1.test1();//we can use this also and recommended cox we can re-Use
		System.out.println(s);
		
		
		//3 calling Third method
		int additon=obj1.add(10, 20);//passing parameters
		System.out.println(additon);
		
	}
	
	//Types of method
	//1.no input and no return
	//void -does not return anything (no return keyword)
	
	   public void test() {
		
		System.out.println("testing lav");
	}
	   
	//2.no Input but return using return keyword
	   
	   public String test1() {
		   
		   String name="Jaggu";
		   String pet="Lav";
		   String bub=name+pet;
		   System.out.println(bub);
		   return bub;//it will return the String hence changing in Method name as Public string
	   
	   }
	   
	//3.Some Input and Some Return
	   
	   public int add(int a,int b) {
		   System.out.println("Sum of add");
		   int sum=a+b;
		   return sum;
	   }
	   
	   
	   
	   //Note:Can we overload main method?
		//Ans.It can be Overload/Static method can alos be overloaded but not overrided
	   
	   //eg.
	   
	   public static void main(int a,int b) {
	   System.out.println("This will run test method");
	   }
	   
	   public static void main(int a,String b) {
		   System.out.println("This will run test2 method");
		   }
	   
	   
	  //when we run this we will get output not defined in the above cases ...it will execute functions within this public static void main(String[] args
	   //JVM will just go into public static void main(String[] args this only and executes 
	   
	   
	   //Note: Non Static Variables and Non Static Methods will be in heap memory (Object will share this)
	   //Note:Static variables and Static methods will be in Common memmory Allocation
	   
	   
	   
	   
	   }
	   
	   


