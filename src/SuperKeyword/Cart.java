package SuperKeyword;

public class Cart extends Product{
	
			//super Keyword is used to access or get the value from the parent class
			//this keyword is always pointing towards current class
			//super keyword is always pointing towards parent class
			//Super keyword can be used for methods/Constructors as well
			//multiple super keyword cannot be used on the same Constructor
			//super cannot be used in main method
	
	
	int maxprize=200;
	
	public void getprize() {
		System.out.println("cart prize is : "+ maxprize);//maxprize can be called directly coz its in same class and both are non-static
		System.out.println("actual Prize is : "+ super.maxprize);//This will give the value from the parent class 
		
	}

	public static void main(String[] args) {
		Cart c=new Cart();
		c.getprize();//This will give 200 cox child class will always be given priority
		
		
	}
}
