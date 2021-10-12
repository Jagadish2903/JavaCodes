package JavaSessions;

import java.lang.reflect.Array;

public class StaticArray {

	public static void main(String[] args) {
		//Two types of array 
		//1.Static Array
		    //Size is fixed 
		    //Syntax is int p[]=new int p[3];
			//here p[] is a array
		  //new is a keyword
		//p[3] is the size of the array 
		//hence Li (ie.Loqwest index is always 0)
		//and Hi(highest index is size(ie.3)
		//length is 4
		//finalysing it Hi=l-1 ; l=Hi+1
		//Note: only similar data type can be used for array 
	
	//Disadvantage of Static array
		//1.Size is fixed(Extra memory and less memory)
		//2.It cannot store different data type apart by using Object array
			
		
		//aInteger Array
		//eg.
		
		int i[]=new int[3];
		i[0]=1;
		i[1]=10;
		i[2]=20;
//		i[3]=30;
		
//		System.out.println(i[3]);//it will throw arrayindexout of bound exception since total length is 3 and array starts from Index 0 so maximum it will take i[2]
		System.out.println(i[2]);
		System.out.println(i.length);//it gives the total length of the array
		//System.out.println(i[4]);it will throw arrayindexout of bound exception since total length is 3 and will throw in run time 
		//System.out.println(i[-1]);//it will throw arrayindexout of bound exception since total length is 3 and will throw in run time 
		//Note: No negative index is there in java
		
		//i[0]=10;//this will replace the i[0] value
		System.out.println(i[0]);//here the output will be 10 
		
		//to print all the values for the above case using for loop
		
		for(int k=0;k<i.length;k++)//if we give k<=i.length it will thrw arrayindex out of bound exception
		{
			System.out.println(i[k]);//this will print all the values of i
			System.out.println(i);//this will print address location of all array stored
			System.out.println(k);//this will show the index of array 
		}
		
		
		//to print all the values for the above case using for each loop
		//enhanced for loop
		for(int e:i) {//here depends on the data type int or string varies e is a element we can use anything and i is a array
			System.out.println(e);
		}
		
		
		
		//b.String Array
		
		String name[]=new String[3];
		
		name[0]="Sambath";
		name[1]="Jaggu";
		name[2]="dhana";
		
		System.out.println(name.length);//gives length
		
		//to print all the values for the above case using for each loop
		
		for(String e:name) {
			System.out.println(e);
		}
		
		//to print all the values for the above case using for loop
		for(int n=0;n<name.length;n++)
		{
			System.out.println(name[n]);
		}
		
		//c.Char Array
		
		char initial[]=new char[3];
		initial[0]='M';
		initial[1]='R';
		initial[2]='P';
		
		//to print all the values for the above case using for each loop
		for(char e:initial) {
			System.out.println(e);
		}
		
		//to print all the values for the above case using for loop
		
		for(int q=0;q<initial.length;q++) {
			System.out.println(initial[q]);
		}
		
		
		
		//Note: what if incase if one wants to store different datatype in a static array 
		//eg.Emp name/Age/salary/ispermanent
		
		//In this case we use Object Static Array
		//Object is a parent class of all classes in java(Super class)
		
		Object empdata[]=new Object[4];
		empdata[0]="Jaggu";
		empdata[1]=29;
		empdata[2]=231.23;
		empdata[3]=true;
		
		//to print all the values with index for the above case using for each loop
		int count =0;//to add index we are assigning a new variable
		for(Object e:empdata) {
			System.out.println(count+"="+e);
			count++;
		}
		
		//to print all the values for the above case using for loop
		
				for(int m=0;m<empdata.length;m++) {
					System.out.println(m+"= "+empdata[m]);
				}
				
		
		
		
	
		
		

	}

}
