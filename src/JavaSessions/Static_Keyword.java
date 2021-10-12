package JavaSessions;

public class Static_Keyword {

	String name;
	int price;
	String color;
	static int wheels=4;//Common property value
	//Static wheels 4  will store in separate memory called Common Memmory Allocation and can be accessed by all the objects
	//if wheels is given blank like static int wheels; it will give default value
	public static void main(String[] args) {
		//eg.Take a Car for a program
		
		Static_Keyword car1 =new Static_Keyword();
		car1.name="Audi";
		car1.price=70;
		car1.color="black";
		//car1.wheels=4;
		
		Static_Keyword car2 =new Static_Keyword();
		car2.name="bmw";
		car2.price=50;
		car2.color="blue";
		//car2.wheels=4;
		
		Static_Keyword car3 =new Static_Keyword();
		car3.name="venue";
		car3.price=20;
		car3.color="red";
		//car3.wheels=4;
		
		// here wheels is a static for all the objects means 4 for all cases so it can be declared as a static in class properties and commented in all objects
		
		//POints to be noted:
		//static keyword is a class properties it cannot be declared in method
		//Object will never hold static property
		
		System.out.println(car1.name+" "+ car1.color+" "+Static_Keyword.wheels);//here wheels is accessed by calling class name not the object 
		
		System.out.println(wheels);//here static variable can directly accessed by calling variable but java will show warning 
		
		
		
	}

}
