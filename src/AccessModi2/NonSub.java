package AccessModi2;

import AccessModifiers.Company;

public class NonSub {

	public static void main(String[] args) {
		Company c=new Company();//created a object of Company Class 
		
		//Except public other variables are not accessible in other Packege non subclass
		
		c.name="Jdk";
		//c.price=500;
		//c.hq="hyd";
		//c.address="hydu";

	}

}
