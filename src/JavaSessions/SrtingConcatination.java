package JavaSessions;

public class SrtingConcatination {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		System.out.println(a+b);//here a and b are numeric and when doing mathematical operation on numeric its called arithmetic opereation
		
		
	 String s1="Testing";
	 String s2="Selenium";
	 System.out.println(s1+s2);//here s1 and s2 are string and when doing mathematical operation on string its called Concatination
	 
	 System.out.println(s1+a);
     System.out.println(a+b+s1+s2);
     System.out.println(s1+s2+a+b);//here s1 and s2 are string and a and b are numberic when doing mathematical operation  its called Concatination
	 //always it follows a left to right execution so first TestingSelenium and then a then b
     
     System.out.println(s1+s2+(a+b));
     
     System.out.println("The Value of a is "+a);//here + is a concatination where string is concatinated to a
     //whenever adding two string it is concatination
     //whenever adding two numbers its called arithmetic operations
     
     //Important Cases 
     System.out.println(10/5);
     System.out.println(10/3);//here 10 is a int and 3 is also int so the result will be in int only java compiles 
     System.out.println(10.0/3);//here 10.0 is a float and 3 is also int so the result will be in float only java compiles 
     System.out.println(10/3.0);//here 10 is a int and 3.0 is float so the result will be in float only java compiles
     System.out.println(10.0/3.0);//here 10.0 is a float and 3 is also float so the result will be in float only java compiles
     System.out.println(0/1);
     //System.out.println(5/0);//Arithmetic exception will be raised
     //System.out.println(0/0);//Arithmetic exception will be raised
     System.out.println(0.0/0);//It will give NAN-not a number
     System.out.println(0.0/0.0);//It will give NAN-not a number
     System.out.println(2.5/0);//It gives Infinity
     System.out.println(2.0/0.0);//It gives Infinity
	}

}
