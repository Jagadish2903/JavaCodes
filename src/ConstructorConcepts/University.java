package ConstructorConcepts;

import java.util.List;

public class University {
   private String name;
    private String headquaters;
   private  List<String> courses;

   
   
  //Creating Constructors 
   public University(String name, String headquaters, List<String> courses) {
	this.name = name;
	this.headquaters = headquaters;
	this.courses = courses;
}
    //Creating a Getter and Setter
   public String getName() {
	   return name;
   }
   
   public void setName(String name) {
	  this.name= name;
   }
    
   
   public String getHeadquaters() {
	   return headquaters;
   }
   public void setHeadquaters(String headquaters) {
		  this.headquaters= headquaters;
	   }
   
   
   public List<String> getCourses() {
	   return courses;
   }
   
   public void setCousesinfo(List<String> courses) {
		  this.courses= courses;
	   }
}
