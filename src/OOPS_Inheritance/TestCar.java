 package OOPS_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		//creating object for Venue class
		
		Venue v=new Venue();
		//wen i use object reference i can access Car class property as well since it inherits (eg.stop method)
		v.start();//This will override Car Start and print venue this is called Method Over riding(ie.Preference will always be given to child class)
		v.stop();//This will inherit from parent since no stop for venue
		v.refuel();//This will inherit from parent since no stop for venue
		v.autoparking();// 	This is a direct method from the Venue class which is not inherited nor overriden ..this type is called Individual
        v.Engine(); //Ths is a grand Parent property inherited to grand child
		
		
		
		
		//hence start method is overridden method
		//stop method is inherited method
		//refuel method is inherited method
		//autoparking method is individual method
		
		
		System.out.println("___________________________________________________________");
		
		//creating a object for a Car class
		 
		Car c=new Car();
		c.start();//this will print car start method and cannot inherit chid class(venue start)
		c.refuel();
		c.stop();
		c.Engine();
		//c.autoparking();//i cannot able to call venue class method using object reference of Car class object
		//i can able to call Car class method using object reference of Car class object only and cannot inherit child class property
		//c.engine() is a parent of car method
	System.out.println("____________________________________________________________________");	
		
	     //TOP Casting:
		//Child class object can be refered by Parent class  reference variable 
		//eg.
		Car c1=new Venue();//here car class reference variable is refered to Venue class and this is called TOP Casting 
		c1.start();//This will call the Venue start coz top casted venue with car class(object created in Venue class) 
		c1.stop();//this will call Car class
		c1.refuel();//this will call Car class
		
		
		System.out.println("___________________________________________________________");	
		
		//Top Casting with Grand Parent 
		//Child class object can be refered by grand Parent class  reference variable also
		        Vehicle V1=new Venue();//here Vehicle V1 is the reference of Grand parent object
		        V1.Engine();
		       // V1.Start();//this cannot be accessed V1 is trying to access child class property which is not allowed 
		       //  V1.Autoparking();//This is a individual method of Venue so it cannot be accessed and this is a called Object Reference Check 
		
		
		//c1.autoparking();//i cannot able to call venue class method java will create a check in compile time itself and it wont allow thats called Reference Type Check
		//In Reference Type check for this case
		//Car c1 is from car class and no method of autoparking in car and also object created in Child(Venue) and Autoparking method is a individual method available in veue class so it cant access 
		
		
		//Down Casting:
		//Parent class object can be refered by Child class  reference variable 
		//eg.
		//Venue v1=new Car();
		//it will throw error in compile time itself but forcefully we can cast by scrolling and click Add Cast to venue which will come like below
		//Venue v1=(Venue) new Car();//now it will be allowed in compile time but wen we run this it will throw Class Cast exception
		//i.e all venue can be car but all car cannot be venue
		//we never use downcast in java cox it will throw exceptions in run time 
		//eg.i have a venue car and changing all the outerlook to AUDI but while runtime we can easily find it 
		
		
		
		//DownCasting with Grand Parent.
		      //Grand Parent class object can be refered by Child class  reference variable 
		        
		        //Venue V2=new Vehicle();
		      //it will throw error in compile time itself but forcefully we can cast by scrolling and click Add Cast to venue which will come like below
		        //Venue V2=(Venue)new Vehicle();//now it will be allowed in compile time but wen we run this it will throw Class Cast exception
				//i.e all venue can be Vehicle but all Vehicle cannot be venue
				//we never use downcast in java cox it will throw exceptions in run time 
		        
	
		        System.out.println("_____________________________________________________________");
		        
		        
		        //Accessing Benz Class
		        Benz b=new Benz();
		        //benz can take any method from Grand Parent Vehicle and Parent Car but not from Sibling Venue

		        b.Engine();//inherited Grand parent property
		        b.start();//inherited Parent property
		        b.Sunroof();//individual method 
		        
		        //Top Casting with the Parent and Grand Parent is allowed 
		        //Downcasting with Parent and GrandParent is allowd in compile level but during run time it will throw error 
		        
		        
		       //TopCasting or downcasting with Sibling is strictly not allowed
		        //eg.
//		        
//		        Venue V4=new Benz();
//		        Benz B1=(Benz)new Venue();
		        
		        
		
	}

}
