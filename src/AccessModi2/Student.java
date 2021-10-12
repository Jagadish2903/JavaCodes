package AccessModi2;

import AccessModifiers.Company;

public class Student extends Company {//Different package but subvlass of Company

	public static void main(String[] args) {
		
		Student s=new Student();//Created a object 
		
		//Except private and default public and protected are accessible in different package and Subclass
		s.name="lav";
		//s.price=20;
		s.hq="Pune";
		//s.address="pun";
		

	}

}
