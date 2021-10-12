package ConstructorConcepts;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
	
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Microbilogy");
		obj1.add("Maths");
		obj1.add("physics");
		
		//to set the values using constructors
		University obj=new University("Dehi","Delhi",obj1);
		
		//to get the Name/headquaters and corses offered
		System.out.println("university name is "+"  "+obj.getName());
		System.out.println("Headquaters is in "+" "+obj.getHeadquaters());
		System.out.println("List of courses offered "+" "+obj.getCourses());
	
	System.out.println("_______________________________________________________");
	
	
		//to update the university name using setter
		obj.setName("Chennai");
		
		//to update the headquaters using setter
		obj.setHeadquaters("Chennai");
		
		
		//to update the courselist
		obj1.remove("Microbilogy");
		obj1.remove("Maths");
		obj1.add("Chemistry");
		obj1.add("Computer science");
		obj.setCousesinfo(obj1);
		
		
		
		System.out.println("university name is "+"  "+obj.getName());
		System.out.println("Headquaters is in "+" "+obj.getHeadquaters());
		System.out.println("List of courses offered "+" "+obj.getCourses());
		
		

	}

}
