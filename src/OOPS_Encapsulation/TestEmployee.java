package OOPS_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeClass e1=new EmployeeClass();
	//Setting the employee details 	
		e1.setName("Jaggu");
		e1.setAge(30);
		e1.setSalary(20.33);
		e1.setIs_Active(true);
		e1.setGender('M');
	
	//2nd employee 
		EmployeeClass e2=new EmployeeClass();
		e2.setName("Sambath");
		e2.setAge(25);
		e2.setSalary(15.33);
		e2.setIs_Active(false);
		e2.setGender('M');
		
		//3nd employee 
		EmployeeClass e3=new EmployeeClass();
		e3.setName("Dhanasekar");
		e3.setAge(22);
		e3.setSalary(12.33);
		e3.setIs_Active(true);
		e3.setGender('M');
		
		
		//Getting  the employee details
		
		e1.Employeeinfo(e1.getName(),e1.getAge(),e1.getSalary(),e1.isIs_Active(),e1.getGender());

		System.out.println("_______________________________________________________________________");
		e2.Employeeinfo(e2.getName(),e2.getAge(),e2.getSalary(),e2.isIs_Active(),e2.getGender());
       System.out.println("____________________________________________________________________________");
		e3.Employeeinfo(e3.getName(),e3.getAge(),e3.getSalary(),e3.isIs_Active(),e3.getGender());
		
	}

}
