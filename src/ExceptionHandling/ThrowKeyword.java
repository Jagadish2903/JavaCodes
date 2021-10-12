package ExceptionHandling;

public class ThrowKeyword {

	//Throw Keyword is used to throw the exception deliberately

	public static void main(String[] args) {
		
//		try {
//			throw new Exception("Lav excel data not found");//to handle our own exception we can use try  catch
//		}
//		catch(Exception e)//Since we delibrately create a exception we have written it as Exception
//		{
//			System.out.println("excel data not found");
//			e.printStackTrace();//it will print stack trace of our own exception 
//		}

	
		
		//Use cases 
		//1.when we are importing data from the excel and f data not found we can write it like below 
		//eg.
		String data=null;
		if(data==null) {
			try{
					throw new Exception("Lav excel data not found");
			}
			catch(Exception e)
			{
				System.out.println("Data not found ");
				e.printStackTrace();
			}
		}
		else {
				System.out.println("Data is available");
			}
		
		
		
		
	}

}

