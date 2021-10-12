package DoubtSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Scenarios {

	public static void main(String[] args) {
		int i=036;
		//what will be value if i print this 
		System.out.println(i);//it will show output as 30 cox it prints octal number
		//using google octal to decimal converter 
		
		
	System.out.println("-------------------------------------------------------");	

		//2.How will u print 
		// 00 01 02 03 04
		//10  11 12 13 14
		//20  21 22 23 24
		//30 31  32 33 34
		
		for(int j=0;j<=3;j++) {//whatever the matrix is just asssign default value  for j and k(eg.4 then trim as per requirement here highest num is 34 so reduced j to 3 
			for(int k=0;k<=4;k++) {
				System.out.print(j+""+k+" ");//since we need 00 01 ..... as output we cannot print j+k so we printed like this//ln is skipped to print in same line 
			}
			System.out.println();//added this to exit first row and print on next line
			
		}
		
		
		//3.How will u delete a value in a Static Array 
		//eg. String players[]={"Dhawan","Rohit","Virat","Rahul"}
		
		
	//To remove the value its not possible in Static so we can convert that into ArrayList
		String players[]={"Dhawan","Rohit","Virat","Rahul"};
		
		ArrayList<String> pr=new ArrayList<String>(Arrays.asList(players));
		//Arrays.asList will collect the static to ArrayList
		
		//it will print list in ArrayList
		pr.remove(2);// This will remove the second index value (i.e Virat)
		System.out.println(pr);
		
		
		pr.add("Jaggu");
		System.out.println(pr);//this will add Jaggu to the list 
		
		
		//4.what is the use of trimToSizemethod in ArrayList?
		//eg.
		
		ArrayList<String> Names=new ArrayList<String>();//whenever we declare this Virtual Capacity=10 by default
		Names.add("Testing");
		Names.add("Selenium");
		Names.add("Good");
		//when we give these values PC=3 And VC=7
		
		Names.trimToSize();//when we use this method we are instructing to trim to size of VC to PC //hence VC=3 as a result
		//for a better memory optimization we can use trimToSize.
		
		
		Names.add("hi");
		System.out.println(Names);
		
		
		//5.How to call the Static method ?
		//Static method can be called directly using a Class name Class.methodname()
		
		//6.What will happen to object reference in stack when the refernce is set to null?
		//Ans.When the reference is set to null the object will be destroyed by Garbage collector in heap memory and the referene will get deleted automatically when the main method ends 
		
		
		//7.What is the difference between removeAll and clear in Static arraylist?
		//both will remove all the values but in terms of performance clear is used cox it doesnt check all the values one by one wereas removeall does
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}


	
	