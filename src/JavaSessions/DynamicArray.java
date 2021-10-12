package JavaSessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		//Disadvantage of Static array
				//1.Size is fixed(Extra memory and less memory)
				//2.It cannot store different data type unless we use Object array
		
		//To Overcome both the limitations we use Dynamic Array(Use of Java Collection/Array List)
		
		
		
		//Dynamic Array---eg. ArrayList
		//Array list--Default Class available in java
		//Size is not fixed
		//we need to create a Object for the ArrayList
		//ArrayList is a Index Based ---which maintains order
		
		//By default Java will reserve the default segment of 10 (which is a virtual capacity)i.e Vc=10 //Java decides Vc 
		//java doesnt have any method to get virtual capacity
		//Actual capacity is used segments from default segment (which is a physical capacity)
		
		
		//USe Cases in Selenium 
		//if there are 10 links in the page and we need amazon to open 
		//Collect all the links in arraylist 
		//Start a if loop if(element e.text.equals("amazon")
		//Click();
		//break;
		
		
		
		//Eg.
		
		ArrayList obj1=new ArrayList();//Import from java.util (ArrayList which is available in jdk)
		System.out.println(obj1.size());//.size method will give the physical capacity i.e used segment i.e we will get 0
		
		obj1.add(100);
		obj1.add(200);
		obj1.add(300);
		System.out.println(obj1.size());//It says the size of the array i.e 3 (in Static we use .length and in dynamic we use .size)
		//.size method will give the physical capacity i.e used segment //3 here 
		
		
		obj1.add(2, 500);//here 2 is the index and 500 is the value 
		System.out.println(obj1);//here it will give 100 200 500 300 which inserts 500 in the second index in previous step so it will insert 500
		
		obj1.remove(2);//2 is the index and .remove will remove the index value
		System.out.println(obj1.get(2));// ,get method will get the value since 500 is removed so 300 will be coming to second index and hence 300 is the value 
		
		
		//To Print all the values using for each loop
		
		for(Object e:obj1)
		{
			System.out.println(e);
		}
		
		//To Print all the values using for  loop
       for (int i=0;i<obj1.size();i++) {
    	   System.out.println(obj1.get(i));   
       }
		
       //eg.2
       //WAP to print the emp names
       ArrayList<String> Obj2=new ArrayList<String> ();//here This is called generics which means it wont allow anyother data type only string allowd
       //Obj2.add(5);//when we try to add integer we will get compile error
       
       //and for Integer 
       ArrayList<Integer> Obj3=new ArrayList<Integer> ();//here This is called generics which means it wont allow anyother data type only integer allowed
     //Obj3.add("Hi");//when we try to add String we will get compile error
       
       //To Overcome this we can create Object ArrayList
       //for empdata
       ArrayList<Object> empdata=new ArrayList<Object>();
       empdata.add("Jaggu");
       empdata.add(100);
       empdata.add(20.23);
       
       System.out.println(empdata);// if we print directly the variable in dynamic it gives in a list whereas in Static array it will give a memory alloation 
       
   	//To Print all the values using for each loop
		
		for(Object e:empdata)
		{
			System.out.println(e);
		}
		
		//To Print all the values using for  loop
      for (int i=0;i<empdata.size();i++) {
   	   System.out.println(empdata.get(i));   
      }
       
      
      //if we are so sure about the number of segments needed we can shrink and a good practice too
      //if we are so sure abt the input is in integer we can use Object but its good to use Integer 
      
      
      
       
       
       
       

	}

}
