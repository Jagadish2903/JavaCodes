package OOPS_Interface;

public interface UsMedical extends who{//Created a Interface 
	
	//we cannot create object for Interface 
	//Interfaces always doesnt have method body if we write method body it will throw error so the crct way is to write as below
	//the methods in Interface is called Abstract method 
	//i.e A method which doesnt have method body 
	//it is also called as Prototype method which has only declaration and no method body
	//interface methods are not static because we will be overriding it (if it is static overriden is not possible)
	//but interface can have Static methods with the body (i.e After JDK 1.8 )
	
	
	public void physioServices() ;
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
 
	
	
	
	//After JDK 1.8 2 things added 
  //1.Interface methods can be static but with body 
  //eg.
	
	
	public static void medicalTreatment() {
		System.out.println("Us Medical Treatment");
		
	}
	
	//The above method cannot be overrideen but it can be hidded (Method hidden) eg.see ApolloHospital 
	
	
	//2.Can Have  a default method with the method body 
	//eg.
	
	default void medicalCertificate() {
		System.out.println("Us ---Medical Certificate");
	}
	
	//The Above method can be Overridden see in apollohospital class and for that we need to remove deffault and replace with public
	//default method should be non Static and Non final 
	
}
