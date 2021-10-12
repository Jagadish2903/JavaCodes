package AccessModifiers;

public class Company {

	//Table for access Modifiers
	
	
	
								//default class					//Private							//protected					//public
	
	//Same Class					yes								yes									yes							yes
	
	//Same Package Subclass			yes								no									yes							yes
	
	//Same Package non-Subclass		yes								no									yes							yes
	
	//Different package	Subclass	no								no									yes							yes
	
	//Different package Non-Subclass no								no									no							yes
	
	
	
	
		public String name ;
		private int price;
		protected String hq;
		        String address;//for a default we should not use default keyword
		
	
	
	public static void main(String[] args) {
					Company c=new Company();//Created a Object
					//Within the Class all the variables are accessible 
					
					c.name="IBM";
					c.price=100;
					c.hq="chennai";
					c.address="Tambaram";
					
					

	}

}
