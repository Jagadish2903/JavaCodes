package OOPS_Inheritance;

public class Basics {

	public static void main(String[] args) {
		//Inheritance ----Inheriting the properties from parents/grandparents/grand to grandparents also 
		//eg. Car is  a Parent class
		//Audi/BMW/Honda are all child classes
		//features of car can be accessed for all the childs (eg.gear/accelarator/horn)
		//adding to it childs will also have some features(eg.BMW as JUmpseat/Audi as Sunroof..)
		//hence BMW and AUDI will inherit the properties of CAR but car cannot inherit from BMW or AUDI
		//and also BMW cannot inherit AUDI or VICE Versa
		
		
		//Multiple Inheritance(which is not allowed in java)
		//consider Truck is another parent class
		//AUDI cannot inherit from Truck class as well as CAR class
		
		//Multilevel Inheritance(which is allowed in java)
		//Consider CAR class has parent as Vehicle class
		//adding vehicle as parent as Automobile
		//now AUDI can inherit property from CAR and VEhicle and also from Automobile
		//this is called multi level 
		
		
		//Method Override
		//incase while inheriting property 
		//car has property of start method(using keys)
		//whereas AUDI will override that Start method by applyig (button to start)
		
		
		
		//Concluding 
		 //at the child level we chave three types of methods 
	     //1.Inherited Method
		//2.Overridden method
		//3.Individual method
		
		
		
		

		
	}

}
