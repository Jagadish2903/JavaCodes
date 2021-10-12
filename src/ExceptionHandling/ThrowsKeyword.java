package ExceptionHandling;

public class ThrowsKeyword {

	//Throws Keyword is used to pass the excepton 
	//It will not handle it 
	
	public void m1() throws ArithmeticException{
		m2();
	}
	
	public void m2() throws ArithmeticException {
		m3();
	}

	public void m3() throws ArithmeticException{
	int i=7/0;
	}
	
	
	
	public static void main(String[] args)  {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.m1();
		System.out.println("Jaggulav");
		
		//here JVM will first come to obj.m1 goes to m1 method and then calling m2 goes and calling m3 and in m3 it throws arithmeticexception
		//so m3 is throwing exception so written  throws ArithmeticException
		//now m2 responsibility again written throws ArithmeticException in m2
		//now m1 responsibility again written throws ArithmeticException in m1
		//now it will come to main method responsibility again written throws ArithmeticException in main method
		//now its JVM responsiblity ...
		//N.B JVM won't Handle it will just print exception 
		//If it handles it must have print "Jaggulav"  in output but it wont so it wont handle it will just print 
		//hence always use try catch to handle the exception on the same method 
		
		//if so when should i use throws ?
		//Ans.if you dont want to handle the exception in a particular method (eg.in Private) we can create a wrapper and use try catch in there
		//Have a Practice not to have a try and catch in main method and throws in main method		
		
		
		//Throws exception will follow Stack method 
		//There are two things Stack and Queues 
		//Stack is Last in First out like theatre entry and exit,hence called LIFO
		//Queues are First In First Out ,Hence it is called FIFO
		
		
		////Always use Try catch for these type Thread.Sleep
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
