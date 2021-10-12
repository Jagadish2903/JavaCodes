package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		//Exception is coming or not anything written inside the finally block will always be executed 
		//finally should be written always after try catch block
		//we cannot write try block without catch block but if we write finally block it is ok which means try and then finally
		//finally block is not responsible for exception handling 
		//we can write try catch inside finally as well
		//finally cannot be written without try catch
		
		
		//Use cases 
		//1.Db Connection --->Sql Connect--->results--->Using result
		//in the above scenario if Db Connection is passed and SQl is exception is raised we cannot stay connected to Db (DB will be overloaded)
		//so in finally we can write as close the Close DB Connection

		
		int a=10;
		int b=0;
		
		
		System.out.println("Test");
		
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is raised");
			e.printStackTrace();
		}
		//System.out.println("hi");//we should not write any thing between catch and finally as per syntax it should be followed after try catch
		finally {
			System.out.println("End");//This will get printed even wen exception is raised or not
		}
		
		

	}

}
