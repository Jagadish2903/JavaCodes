package OOPS_Interface;

public class ApolloHospital extends Hospital implements UsMedical,UkMedical,indianMedical{

	//implements keyword is used to achieve mutiple inheritance
	//when we write implements we have to implement all the methods in UsMedical interface compulsory
	
	
	//when we try to remove anyone of these below methods it will immediately throw error at compile time itself 
	
	//always use extends keyword after the class name
	//So totally it has four parents 3 interface and 1 class
	
	@Override
	public void physioServices() {
		System.out.println("Apollo  physioServices ");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("Apollo  oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("Apollo  dentalServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("Apollo  cardioServices");
		
	}

	@Override
	public void entServices() {
		System.out.println("Apollo  entServices");
		
	}

	@Override
	public void gynoServices() {
		System.out.println("Apollo  gynoServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Apollo  neuroServices");
		
	}

	@Override
	public void generalServices() {
		System.out.println("Apollo  generalServices");
		
	}

	@Override
	public void dermaServices() {
		System.out.println("Apollo  dermaServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("Apollo  emergencyServices");//emergency Services is common present in all the interface when we implement the method ,it will come only once 
		
	}
	
	
	public void billing() {
		System.out.println("Individual method-- billing from Apollo ");//created individual methods
		
	}
	
	public void medicalInsurance() {
		System.out.println("Individual method-- Insurance from Apollo ");//created individual methods
		
	}

	@Override
	public void covid19test() {
		System.out.println("Covidtest-- Apollo ");
		
	}
	
	

	//incase in future if we add or remove any one services in UsMedical it will throw error in Appollo to implement that method 
	//forcing to remove we need to remove @Override here so it will act as Individual method for apollow
	//we can Implement multiple interfaces using implement keyword but we need to unimplement methods of respective interface
	
	
	
	
	
	
	
	//Method Hiding 
	//To check wheather it is overridden @Override
//	public static void medicalTreatment() {
//		System.out.println("Us Medical Treatment");
//		
//	}
	
	
	//
	
//	default void medicalCertificate() {
//		System.out.println("Us ---Medical Certificate");
//	} //It will throw error because it is in default 
	
	//Changing default to public 
	
//	@Override
//	public void medicalCertificate() {
//		System.out.println("Appolo ---Medical Certificate");
//	}
//	
	
}
