package Interviewques;

public class Java  {

	public static void main(String[] args) {
//		package JavaSessions;
//
//		import OOPS_Inheritance.Car;
//		import OOPS_Inheritance.Venue;
//
//		public class InterviewQuestions {
//		String name;
//		int age;
//			
//			// 1.Can a Object have two references
//				//Yes it can have eg.
//				
//			    //eg program
//			          
//			InterviewQuestions a1=new InterviewQuestions();
//			a1.name="jaggu";
//			a1.age=20;
//			
//			InterviewQuestions a2=new InterviewQuestions();
//			a2.name="Lav";
//			a1.age=20;
//			
//			InterviewQuestions a3=new InterviewQuestions();
//			a3.name="Dinesh";
//			a3.age=20;
//			
//			a1=a2;
//			a2=a3;
//			a3=a1;
//			System.out.println(a1.name);
//			System.out.println(a1.age);
//			System.out.println(a2.name);
//			System.out.println(a2.age);
//			System.out.println(a3.name);
//			System.out.println(a3.age);
			
			//The output will be Lav /Din/Lav ..Jaggu will not be printed cox a1 ref is pointing towards a2 so first lav 
			//a2 ref is pointing towards a3 so second dinesh
			//a3 is pointing towards a1 which is already pointed towards a2 hence lav 
			//here a2 is having 2 references a1 and a3
			
			
			//2.Which is a object in this case obj o1=new obj();
			//AnS --obj is a class/ o1 is a obj reference / new is a keyword /obj() is a class / new obj() is a object
			
			//3.What is a null reference?
			// Ans --Note: Objects created will be stored in Heap memory and Object reference will be stored in stack memory
			 //Eg.obj o1=new obj();
			// o1 will be in stack and obj will be in heap
			//o1=null; which means o1 pointing towards obj will be disconnected and value for o1 reference will be null
			
			//4.What is a Garbage Collector?
			//Ans.Garbage collector is a one which is used for memory utilization
			//JVM Instructs the Garbage Collector to Clean up objects with no reference or Null reference in Heap Memory
			//Garbage collector cannot do anything in Stack memory
			//JVM Instructs automatically to Garbage collector ;we can call garbage collector by using System.gc() to clean up but it will further asks JVM whether to do so 
			
			
			//4.What is a Null Pointer exception?
			//Using the above prog and create a new object
			//InterviewQuestions a4=new InterviewQuestions();
			
			//a4=null;
			
			//System.out.println(a4.name);//now it will throw exception called null pointer exception 
			
			//5.Can a Object be created without reference
			
					//Yes it can be created but it will create n number of object for n number of variables eg
					//new ClassandObjects().name="jaggu";
					//new ClassandObjects().age=23;
					//for line 72 a object is created  and for line 73 a object will be created thats why we need to use reference
					//java will handle this using a Garbage collector
			
			
			//6.where will the Static property value gets stored whether heap or stack?
			 //Ans.It will store in separate memory called Common Memmory Allocation and is called Metaspace(Before JDK1.7)--CMA is a part of heap 
			//after 1.8 jdk its called  permananent generation and separate space CMA
			
			//7.How will you access Static value in the method? eg.static int wheels=4;
			// Ans.static variable is accessed by class name 
			  //Class.wheels;
			
			//8.Can we access static variable using object name?
			//Ans.yes we can use but java will give warning tat static should be accessed by class name 
			
			//9.Diff between Metaspace and Permanent Generation?
			//size is fixed for metaspace (ie.before 1.7 jdk) and it will throw overflow error if space exceed
			//Permanent Generation is a dynamic space it keeps on increasing depends on Common memmory (It will use RAM)
			//Garbage Collector will not come into CMA
			
			//10.What is a Methods in Java?
			//Block of Statements
			//Can be Static or non-Static
			//can be called 
			//cannot create a method inside the method
			//Duplicate methods are not allowed but can be overloaded
			//methods are parallel to each other(Independent)
			
			//11.what is a Method Overloading?
			 //within the same class having same name with different parameters/type of parameters/sequence of parameters
		     //also called as Compile Time Polymorphism(Static polymorphism)(Early Binding)
			//Because  on the basis of calling number of parameters it decides at the compile time
			
			//12.Diff bet Arguments and Parameters
			 //Ans. Parameters is something like Eg.(String a,String b)
			 //arguments is values eg.("Jaggu","Lav")
			
			//13.what is the output
//			 for(;;)
//			 {
//				 System.out.println("hi");
//				 }
			//ANS.it will print hi n number of times becoause default it will take condition is satisfied since it is a ugly code
			 
			 //14.what is the default Virtual capacity in Java?
			//Ans.By default it will create Virtual capacity of 10 we can increase based on our requirement 
			//ArrayList ar=new ArrayList(50);//it will create 50 segments
			
			//15.Can we overload main method?
			//Ans.Yes It can be Overloaded but not overridden/Static method can alos be overloaded but not overrided
			
			//16.Can we return multiple functions ?
			//Ans.Yes we can return multiple functions in the form of ArrayList/Static Array
			
			//17.Can we have multiple return statement in same funtions?
			//At a time a function can return only single return 
			
			
			 //18.What ia a Constructor?
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
			
			
			
			//19.What is Method Overriding?
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
			    //Static method can be inherited(i.e if we create a static method for Car class and call using Venue class object reference it inherits Car)
			
			    //Static methods can be overloaded
				
			 //20.What is the user of @Override?
			//It is a annotation used to chack whether it is overridden or not and is a good practice to write all time 
			
			//21.What is a TOP Casting?
			//AnsChild class object can be refered by Parent class object reference variable 
					//eg.
					//Car c1=new Venue();//here car class(Parent) reference variable is refered to Venue(Child) class and this is called TOP Casting 
			
			//23.//Calling methods ....Static to Static using Class  .....Static to non-Static using object
			
			//24.Why interface variables or methods are static in nature ?
			//because by default in java interface cannot create object ..
			
			 //25.What is a abstract method?
			//the methods in Interface is called Abstract method 
			//i.e A method which doesnt have method body 
			//also called Prototype Method
			//we canot write static or final in Interface method because interface methods are always overridden in the child class
			
			//26.What are the two things introduced after JDK1.8 

			// Ans After JDK 1.8 2 things added 
		  //1.Interface methods can be static but with body 
		  //eg.
			
			
//			public static void medicalTreatment() {
//				System.out.println("Us Medical Treatment");
//				
//			}
		//	
//			//The above method cannot be overrideen but it can be hidded (Method hidden) eg.see ApolloHospital 
		//	
		//	
//			//2.Can Have  a default method with the method body 
//			//eg.
		//	
//			default void medicalCertificate() {
//				System.out.println("Us ---Medical Certificate");
//			}
		//	
//			//The Above method can be Overridden see in apollohospital class and for that we need to remove deffault and replace with public
//			//default method should be non Static and Non final 
			
	}
}
	

