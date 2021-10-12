package AccessModifiers;

public class Employee extends Company{//inherited the property 

	public static void main(String[] args) {
		Employee e=new Employee();//Created a object
		
		//except private other variables are accssible in Subclass
		e.name="microsoft";
		//e.price=200;
		e.hq="Mumbai";
		e.address="errri";
		
		
		

	}

}
