package BuilderPattern;

public class Browser {
	
	//The below process is called method chaining
	public  void launch() {
		checkOs();//checkOs and checkRam /launch can be called internally and directly coz it is declared within the class
	}

    public  void checkOs() {
		checkRam();
	}

    public  void  checkRam() {
	System.out.println("ha ha ");
     }
	
    
    //Method Chaining Static Method
    
    public static void m1() {
    	m2();//Static method can also be called using method chaining but other nethod should be in static as well 
    }
    
    public static void m2() {
    	System.out.println("bye");
    }
    
    
    
    
	public static void main(String[] args) {
	   Browser br=new Browser();//created object because calling a non static from a static 
	   br.launch();		
		 
	   
	   m2();//to call the static method within the same class so it can be called directly without class name or creating a object
	   

	}

}
