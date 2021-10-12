package OOPS_Encapsulation;
 //Encapsulation---Accessing Private variable or method by creating a public method in that class and access those private variables or methods using the public from other class

public class ILIMTeam {

	   private String name;//name here is a global variable
	   private int Noofmembers;
	   private String designation;//all the private variables can be accessed within the class directly by creating a object when the method is in static 
	   //but accessing from outside the class is done by creating a public class using getter and setter 
	   
	   //Note 1.Never create getter and setter for public methods 
	   //eg
	   public String Senior;
	   
	   //using getter and setter from source ---rightclick
	   public int getNoofmembers() {
		return Noofmembers;
	}
	public void setNoofmembers(int noofmembers) {
		Noofmembers = noofmembers;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
//Setter and getter are the methods and they are public in nature
  public void setName(String name) {//name here is a local variable
	//name=name;//if we write like this its like assigning local varable to local variable 
	//to solve the above case we need to use this keyword
	  this.name=name;//this.name is a global variable and name is a local variable 
	  //this method will just assign the value and to return the value we need to use getname
} 
	   public String getName(String name) {
		   return name;//this will return the value
	   }
	
//instead of creating getter and setter for all the private variable we can do it by using rightclick -->source--->Generate Getter and Setter





// 2nd Type ..Instead of creating a getter and setter we can do othr way like below 

public String getTeaminfo() {
	String info =name + Noofmembers +designation ;
	return info;
}
}
