package BuilderPattern;

public class Shopping {

public Shopping login(String un ,String pwd) {
	System.out.println("Login using "+un+":"+pwd);
	return this; //this keyword is returning class object so instead of void we have written Shopping 
	//return new Shopping(); we can write this also but everything it creates a new object which is not ok
}

//Overloaded
public Shopping login(long ph ,int otp) {
	System.out.println("Login using "+ph+":"+otp);
	return this;
}

public Shopping serachProduct(String product) {
	System.out.println("Search Product is "+product);
	return this;
}
//Overloaded
public Shopping serachProduct(String product,String color) {
	System.out.println("Search Product and color is "+product+":"+color);
	return this;
}

public Shopping addtoCart() {
	System.out.println("Adding to Cart");
	return this;
}

public Shopping doPayment(String cc,int otp) {
	System.out.println("Payment done with "+cc+":"+otp);
	return this;
}
//Overloaded
public Shopping doPayment(long dc,int otp) {
	System.out.println("Payment done with "+dc+":"+otp);
	return this;
}
//Overloaded
public Shopping checkStatus(String product) {
	System.out.println("Checking Status for "+product +"status is 1234");
	return this;
}

public Shopping logOut() {
	System.out.println("logging out");
	return this;
}



//Note ..we cannot use static method here 
//eg.


//public static Shopping getShop() {
//	System.out.println("Getting shop");
//	return this;
//}

//The above method will throw error cox static method cannot return anything 





}
