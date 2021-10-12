package SCP;

public class Student {

	public static void main(String[] args) {
	
		//SCP is String Constant Pool 
		
		//String literals
		String s1="Tom";
		String s2="Tom";
		String s3="Tom";
		//Since String is a non primitive and a class and will be treated differently
		//s1 and s2 is a reference
		//tom is a object
		//String s1="Tom" and String s2="Tom" and String s3="Tom" when we are writing like this it will create a object inside the SCP alone in heap memory
		//After jdk 1.7 SCP is a part of heap memory before it was separate memory
		//here s1,s2,s3 are pointing to same object
		
		//using new keyword
		String s4=new String ("jerry");
		//when we are wrinting this line it wil create 2 objects (1.SCP and 2.Heap memory) but reference will be given to heap memory alone 
		//it will not create a reference to the object in SCP
		
		String s5=new String ("jerry");
		//when we are wrinting this line it wil create only 1 object (1.Heap memory)and since the object jerry is already present in SCP without ref it wont create a object again
		
		//This process of not allowing duplicate values in SCP is called String Optimization
		//only for String it is allowed 
		
		
		System.out.println(s1==s2);//true cox of memory location is same
		System.out.println(s4==s5);//false cox of memory location is diff
		
		System.out.println(s4.equals(s5));//true cox of value 
		//hence for comparing values we need to use .equals 
		
		//To compare the memory address always use==
		//To compare the values always use .equals 
		
		//Always its a good practice to use String literals String s1="Tom"; coz it will restrict creation of same object with diff reference
		
	
		//Imp :
		
		String s6="hello";//it will create a object in SCP as Hello and refered to s6
		s6= "world";//wen we write it will create a new object world in SCP and reference for s6 will be replaced but it wont delete hello or replace it
		System.out.println(s6);
		//it will print world only
		//hence String is non primitive and non-Mutable 
		
		int s8=20;
		s8= 15;//this will delete the 20 and replace with 15 
		System.out.println(s8);
		//it will print 15 only
		//hence int is  primitive and Mutable 
		

	}

}
