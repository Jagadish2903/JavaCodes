package OOPS_Encapsulation;
///accessing multiple private methods through public method
public class LaunchBrowser {
    
	//Creating a wrapper to private variable or private method by a public method is called encapsulation
	private void checkRam() {
		System.out.println("Checking Ram");
	}
	
	private void checkHarddrive() {
		System.out.println("Checking checkHarddrive");
		
	}
	
	private void checkURL() {
		System.out.println("Checking checkURL");
		
	}
	
	public void Launchbrower() { 
		System.out.println("Launching Chrome");
		checkRam();    //private methods can be directly called cox its in same class
		checkHarddrive();
		checkURL();
		System.out.println("Chrome is launched");
	
	}
	
	
	
}
