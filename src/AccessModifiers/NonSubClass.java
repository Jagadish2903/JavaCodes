package AccessModifiers;

public class NonSubClass {

	public static void main(String[] args) {
		Company c=new Company();//created a object of Company class 
		
		//Except Private all are accessible in non SubClass
		c.name="Jaggu";
		//c.price=100;
		c.hq="madurai";
		c.address="nama";
		
		
		
	}

}
