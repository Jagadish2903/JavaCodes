package OOPS_Encapsulation;
//Encapsulation is a one of the feature in OOP in Java
//Encapsulation is nothing but private properties wrapped with public layer (public layer could be getter or setter for a private method wrapped with public method)

public class EmployeeClass {

	private String name;
	private int age;
	private double salary;
	private boolean is_Active;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isIs_Active() {
		return is_Active;
	}
	public void setIs_Active(boolean is_Active) {
		this.is_Active = is_Active;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void Employeeinfo(String name,int age,double salary,boolean is_Active,char gender) {
		//System.out.println(name+" "+age+" "+salary+" "+is_Active+" "+gender);
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("Salary earning "+salary);
		System.out.println("Is Employee Active "+is_Active);
		System.out.println("The Gender is "+gender);
		
		
	}
	
	
	
	
	
	
}
