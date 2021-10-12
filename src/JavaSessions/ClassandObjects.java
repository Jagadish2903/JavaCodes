package JavaSessions;

public class ClassandObjects {

		//Class is a blueprint/template of all objects
		//Class is a concept 
		//Class is a template --->Create a object
		//eg.Car is a class from this class we can create bmw/audi etc 
		
		//Class variable will be declared in Class level before main method
		//Class Variable -->will always be declared in common (eg.String name;)
		//These Class variables are called Class properties or Global variable
	
	
	String name;//we cannot define String name ="tom" since tom alone is not used as name (i.e values will not be defined)
	int age;
	double salary;
	boolean isworkingnow;

	public static void main(String[] args) {
		
		String name="Lav"; //This variable is called Local Variable 
		//Local Variable is always should be initialised (given value)
		//Global Variable should be called always using obj refrence where as local variable can be declared directly
		//we can use same name for local and Global variable as well 
		
		System.out.println(name);//it will call local variable 
		
		//create a object using new keyword with class name 
		
		ClassandObjects e1=new ClassandObjects(); //here e1 is not the object its the object reference variable //obj is new ClassandObjects()
		
		//we have cretaed a object to access the class variable which is declared in class level by using object reference e1
		
		System.out.println(e1.name);//here the output will be null cox String default value is null ,we havent given any value
		
		//Default value of int is 0
		//Default value of Double is 0.0
		//Default value of boolean is false
		
		
		
		//giving value to the class variables by calling the object
		e1.name="Jaggu";
		e1.age=30;
		e1.salary=23.23;
		e1.isworkingnow=false;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isworkingnow);
		
		
		
		ClassandObjects e2=new ClassandObjects();
		e2.name="usha";
		e2.age=50;
		e2.salary=66.23;
		e2.isworkingnow=true;
		
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		System.out.println(e2.isworkingnow);	
		
		
		
		//QA.   Can a Object be created without reference
		
		//Yes it can be created but it will create n number of object for n number of variables eg
		//new ClassandObjects().name="jaggu";
		//new ClassandObjects().age=23;
		//for line 72 a object is created  and for line 73 a object will be created thats why we need to use reference
		//java will handle this using a Garbage collector
		
		
		
	}

}
