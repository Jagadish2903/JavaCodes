package ExceptionHandling;

public class TryCatch {
     
	String name="Jaggu";
	
	
	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		TryCatch obj=null;//given the object ref as null 
		
		  System.out.println("A");
		  System.out.println("A");
		  System.out.println("A");
		  
		  //int i=7/0;
		  
		  try{
			  int i=a/b;//this will throw Arithmetic exception cox no div by 0
			  System.out.println(obj.name);//This will throw nullpointer exception cox object ref is null
		  }
		  catch(ArithmeticException e)//e is  a reference of Exception Class no need to create a object and is always a good pracctice to write the Exception name if known or else we can write Exception
		  {
			  //System.out.println(e);//if we dont want to know the exception in utput we can avoid it but its good practice to print
			  e.printStackTrace();// its a default method available for reporting the exception type raised
		  }
		  catch(NullPointerException e)
		  {
			  e.printStackTrace();
		  }
		  
		  System.out.println("B");
		  System.out.println("B");
		  System.out.println("B");
		  
		  //Here B will not be printed ...only A will be printed and in line 11 it will throw Arithmetic exception
		  //To handle it we need to use Try catch 
		  //Always use catch if using try
		  //try and catch is a Keyword and Exception is a default class in Java
		  // write the line which causes error in try and handle it by catch method 
		  //This will still run the next line of code even if the exception is raised 
		  //Exception is  a Parent Class and Arithmetic/null pointer/index out of bound/Array Index out of bound/...etc are child classes 
		  //we can write mutilple catch method for a try
		  //we can use e or any reference and use multiple times as well
		  
		  
		  //Note:
		    //if incase user changes value for a and bnot equal to 0 then according to exception it will catch ...
		   	//It wont raise two exception at a time 
		  	//i.e If line 21 raise exception it will go directly to catch block it wont raise exception in line 22
		  	//it wont enter the catch block if there is no exception in the code
		  
		  
		  	//There is one more Class Called Error different from  exception
		  	//Error like memory full /System failure etc ..practically rare
		  	
		  	//Throwable is a Parent of Error and Exception class 
		  	//Instead of Exception in above code we can write Throwable (Parent of Exception) But its not a good practice
		  	//Parent of Throwable is a Object Class
		  	//but we cannot handle the exception using Object class cox it doesnt have property to do tat
		  	//N.B Always Use Respective Exception and Multiple caatch blocks(Eg.ArithmeticException)
		  
		  
		  
		  
		  
		  
		  	
		  	
		  
		  
		  
		  
		  
		  
	}

}
