package OOPS_Interface;

public class TestApollo {

	public static void main(String[] args) {
		ApolloHospital obj=new ApolloHospital();//created a object for ApolloHospital class
		obj.emergencyServices();	
        
		
		obj.billing();
		
		obj.medicalInsurance();
		//we cannot create object for Interface 
		//eg.UsMedical obj2=new UsMedical();
	
		System.out.println("____________________________________________________________");
		//Top Casting USMedical--Child Class object refered by Parent interface reference Variable
		
		UsMedical us=new ApolloHospital();
		us.physioServices();
		us.dentalServices();
		us.oncologyServices();
		us.emergencyServices();
		
		//Above methods shows using Top Casting we can access only methods declared in LHS (i.e UsMedical)
		//we cannot access individual methods declared in apollow hospital it will restrict by a reference check so not possible 
	
		
		
		System.out.println("________________________________________________");
		//Top Casting UkMedical--Child Class object refered by Parent interface reference Variable
		
				UkMedical uk=new ApolloHospital();
				
				uk.cardioServices();
				uk.entServices();
				uk.gynoServices();
				uk.emergencyServices();
				//Above methods shows using Top Casting we can access only methods declared in LHS (i.e UkMedical)	
				//we cannot access individual methods declared in apollow hospital it will restrict by a reference check so not possible 
				
		

				System.out.println("________________________________________________");
				//Top Casting indianMedical--Child Class object refered by Parent interface reference Variable
				
						indianMedical ind=new ApolloHospital();
						ind.neuroServices();
						ind.generalServices();
						ind.dermaServices();
						ind.emergencyServices();
						//Above methods shows using Top Casting we can access only methods declared in LHS (i.e indianMedical)	
						//we cannot access individual methods declared in apollow hospital it will restrict by a reference check so not possible 
						
				
		
			System.out.println("________________________________________");
			
			obj.helpdesk();//This will inherit the property of hospital 
			//if i need a property of appolo to be override write a method in ApolloHospital again and Override 
			
			
			obj.covid19test();	//covid19test is a grandparent of apollo
			
			//obj.pandamicAnnouncement();//is a grandparent
			
			uno.pandamicAnnouncement();
			
			
			//obj.medicalTreatment();//to access the Static method hiding in ApolloHospital class
			
			
			
			//To call the static method declared in UsMedical interface using Interface name 
			
			UsMedical.medicalTreatment();
			
			//To call the non Static method declared in UsMedical interface we need to use obj or can be called using a child class since it inherits
			obj.medicalCertificate();//obj is a object created for Apollo Hospital
			
		
			
			
			
			
			
			
			
			
			
			
			
	}

}
