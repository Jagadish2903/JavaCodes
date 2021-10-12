package ConstructorConcepts;

public class User {

	
private String name;
private int age;
private String organization;



//creating constructor which acts as a setter
 public User(String name,String organization) {
	 this.name=name;//name is a local variable and this.name is a global variable
	 this.organization=organization;//organization is a local variable and this.organization is a global variable
	 
 }
 
 public String getName() { 
	 return name;
 }
 public String getOrganization() { 
	 return organization;
 }



 
 //To Create a Constructor as like getter and Setter Right Click-->Source--->Generate Constructors
 //eg.
public User(String name, int age, String organization) {
	super();
	this.name = name;
	this.age = age;
	this.organization = organization;
 
}
 //To update the value in TestUSer class we need setter here even though Constructors acts as setter 
public void setName(String name) {
	this.name=name;
	//created setter in need of update the value in TestUSer name from Jaggu to lav
}
}
