package HashmapConcepts;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	public static void main(String[] args) {
		//Hashmap is not a arraylist
		//it doesnt stores the value in order
		//It stores on the basis of <Key,Value>
		//Every key and a value is called a SET(or) Pair
		
		
		//eg.
		//name:Jaggu
		//Product:iphone
		//prize:2000
		//address:Et2
		
		//here //name  / Product /Prize/address are keys
		//Jaggu /iphone/2000/address are values
		
		//Use cases .....Properties --Config Propertis is also using key and value concept
		//Use cases for selenium 
		   //1.RBAC-Roll base Access Control(User permission control
			//eg.all users can login(vendor,Partner,Admin,Customer etc) see class Amazonweb
		
		 //How Hashmap works?
        //Default Virtual segment for Hashmap is 16(i.e 0 -15)
        //Each Virtual segment is divided into 4 parts
        //1.Key 2.hashcode 3.Value 4.Reference
        //the moment we create a object it will create 16 virtual segments
        //empHash.put("Jaggu", "Tester") while adding it java will cretae a Hashcode for given key
        //Then using the Hashcode it will perform some operations to get Index
        //After getting Index it stores on that Index
        //N:b The Hashcode of null will be always 0 and index is 0 so it will store null key in the 0th Index
        //Incase if the Hashcode clashes with another key Eg.empHash.put("Jaggu", "Tester") hashcode is 3 and empHash.put("Sai", "Dev"); is also 3
        //Java will create a Linked list nodes and store the other value in same index 
        //while getting the value also it uses the same concept
        //it will calculate the hashcode for Jaggu and then get the index from the index it gets the value
        
        //What if the collision happens 100 times java wil create 100 linked list nodes 100 times and iterate and get value 
        //before Java 1.7 it used to be lyk tat and performance of Hashmap is too slow during this type of prob
        //After Jdk 1.8 they created a threashold value .
        //threshold ====max Linked list node ===8
        //after 8 Linked list nodes Java will covert all the linked list nodes of index to Balance(or) Binary Search tree (BST)
        //Time Complexity of BST is 0(Log N)
        //performance will be faster 
        //BST will be called only if Threshhold value is greater than 8 
        //Every linked list in hashmap is made of nodes
        
        
        
		
		HashMap<String,String> empHash=new HashMap<String,String>();
		
		//here String,String is a Key and the Value
		//to add the key and Value in array we use .add but in hashmap we use .put
		empHash.put("Jaggu", "Tester");//This is one set
		empHash.put("Sambath", "Manual Tester");
		empHash.put("Santhosh", "BA");
		empHash.put("Sai", "Dev");
		empHash.put("Ajith", "Automation Tester");
		empHash.put("Sai", "Doc dev");
		empHash.put(null, "Invoice tester");//Passing a null key 
		empHash.put("Aravind", null);//Passing a null value 
		
		
		
		
		
		System.out.println(empHash.get("Jaggu"));//To get the value by passing the key
		System.out.println(empHash.get("siva"));//This will give null cox it doesnt have siva as a key
        System.out.println(empHash.get("Sai"));//This will give last modified changes 
        System.out.println(empHash.get(null));//This will give Invoice Tester ..it will check for null key value as well
        System.out.println(empHash.get("Aravind"));//this will give the null value stored against Arav key
        
        
        System.out.println(empHash);//To print all the values in horizantal 
        

        //to maintain the same order as like input use LinkedHashmap as like below while creating a object
        //HashMap<String,String> empHash=new LinkedHashMap<String,String>();
        
        //To iterate the complete list we need to use the any of below loop 
        
        //1.Enhanced forloop
        for(Map.Entry<String,String> e:empHash.entrySet()) {//Since the input is both String we have given String 
        	String key=e.getKey();//.get key method available in java and return type is Object by default and to get the key we use this 
        	String value=e.getValue();//.get value method available in java and return type is Object by default and to get the value we use this 
        	System.out.println(key +":"+value);
        }
        
        //2.iterate by using lambda
        
        empHash.forEach((k,v) -> System.out.println(k+":"+v));//forEach is default available in java 
        // -> is called as lambda 
        // this lambada can also be used for array list 
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
	}

}
