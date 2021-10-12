package BuilderPattern;

public class TestShop {

	public static void main(String[] args) {
		Shopping shop=new Shopping();
		
		//shop.login("Jaggu@gmail", "Jaggu@123");//since the return type is the class of the object and the method declared in Shopping class return class object we can write as 
	
		
		
		
//Method Chaining --by creating a only object 
		 //Advantages---better readable/reusable/we can create a end to end scenario 
		 //limitation ---we cannot use in all cases cox this is a violation to Page Object Model
		
		
		//check using username and password)
		shop.login("Jaggu@gmail", "Jaggu@123")
		    .serachProduct("Iphone")
		        .serachProduct("Iphone","Black")
		           .addtoCart()
		              .doPayment("Credit Card",12586)
		                 .checkStatus("Iphone")
		                    .logOut();
		           
		System.out.println("__________________________________");
		
		//check using phone and otp
		
		shop.login(9789037700l,1258)
		      .serachProduct("Iphone")
		         .doPayment("Credit Card", 12589)
		             .logOut();
		
	System.out.println("________________________________________");	
		
	//just browsing and logout
		
		shop.login("Jaggu@gmail", "Jaggu@123")
		      .serachProduct("Samsung")
		        .logOut();
	
	System.out.println("___________________________________");
	
	//just login and logout
		shop.login("Jaggu@gmail", "Jaggu@123")
		       .logOut();
		

		
		
		
		
	}

}
