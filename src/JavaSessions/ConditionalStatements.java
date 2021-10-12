package JavaSessions;

public class ConditionalStatements {

	public static void main(String[] args) {
   //if is a keyword
   //if else
   //nested if
   //switch
		
	int a=10;
	int b=20;
	
	if(a==b) { //if the condition satisfies it enteres into if or else it wll enter into else
		
		//here (a==b) is a boolean expression 
		System.out.println("Yes a is == b");
	}else
	{
		System.out.println("No a is not equal to b");
	}
		
	//case --dead code eg
	if(true) {
		System.out.println("Yes a is == b"); 
	}else
	{
		System.out.println("No a is not equal to b"); //here yellow line represents dead code and compiler gives this warning since it wont come inside else at all(waste of memory) itt will print if
	}
	
	//Case2
	  String name="jaga";
     if(name=="jaga") { 
		System.out.println("Yes a is == b");
	}else
	{
		System.out.println("No a is not equal to b");
	}
     
   //Case3
	  boolean isvisible= true;
    if(isvisible) { //here is visible is declared as true in declaration itself so it will just execute if 
		System.out.println("Yes a is == b");
	}else
	{
		System.out.println("No a is not equal to b");
	}
    
    //Case4 Nested If(if one condition satisfies it will check other condition as well and also we can write as else as well)
    
    int j=80;
      if (j<=100) {
    	  System.out.println("yes j is less and equal than 100");
      
                  if(j>=80) {
        	              System.out.println("No j is greater than or equal to 100");
         
                          if(j>=100) {
        	                      System.out.println("sorry j is greater than or equal to 80");
                                     }
                                      else {
            	                             System.out.println("Hi");
                                            }
	
	                        }else {System.out.println("bi");
	
	                        }
                     }else {System.out.println("hello");
                     }
      
	
    //Case 5 practical examples
	   //question is to open a browser it could be ff,ie,ch,safari
	   String browser= "kj";
	  
	      if(browser.equals("Chrome")) {//here if we are about to compare string we need to use .equals if primitive we can use == 
		                     //diff bet is == is used to compare values .equals is used to compare references
	    	                        System.out.println("Launch chrome");
	                             }
		                             else if(browser.equals("firefox"))//else if is not a combined keyword
	                                         {
	                            	          System.out.println("launch firefox");
	                                            } 
	                                              else if(browser.equals("safari"))
	                                             {
	                                	           System.out.println("launch safari");
	                                             }
	                                              else if(browser.equals("ie"))
		                                             {
		                                	           System.out.println("launch IE");
		                                             }else
	                                              {
	                                	          System.out.println("Please lauch correct browser");
	      
	                                             }
	}
	//in the above example compiler checks all the condition if user gives invalid input which makes compilation time increase when we use this or nested if)  
// for tat we need to use Switch case statements


//Same logic using Switch case

}
