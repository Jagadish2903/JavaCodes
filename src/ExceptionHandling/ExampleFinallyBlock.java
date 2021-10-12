package ExceptionHandling;

public class ExampleFinallyBlock {
	
	public static int getName(String Name) {
		if(Name.equals("Sambath")) {
			
			try{
				int marks=90/0;
				return marks;
			}catch(ArithmeticException e) {
				e.printStackTrace();
				return 150;
				
			}
			finally {
				return 100;
			}
		
			
		}
		else if(Name.equals("Hari")) {
			return 40;
		}
		else {
			return 50;
		}
		
	}

	public static void main(String[] args) {
		 //System.exit(0); //This is a shutdown method available in default ..it will shut down JVM and wont proceed so wen we print this console will be blank
		 
	    System.out.println(getName("Jaggu")); //this will return 50
	    System.out.println(getName("Sambath"));//this will throw exception to handle used try catch 
	    //while executing above line it will throw exception adn will be handled in catch block even though 150 is returned in catch blcok it wont return tat cox 
	    //it is overridden by return 100in finally block 
	    //hence whether exception is raised or not finally will be executed 

	  
	    
	    
	    
	}

}
