package ConstructorConcepts;

public class TestUSer {

	public static void main(String[] args) {
       //creating a object to call the constructr directly
		
		//User emp1=new User();// This will throw error because we have given parameters in User class whereas we are creating object without parameters
		//User emp1=new User(10,jaggu);// This will throw error because we have given parameters as both String in User class whereas we are creating object with invalid parameters
		User emp1=new User("Jaggu","TCS");//this will accept because Jaggu and TCS are String which matches paramsin the User class
		
		// to get the output we need to create a getter so created getter in User clss
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getOrganization());
		
	     emp1.setName("Lav");//updating name from jaggu to lav
	     System.out.println(emp1.getName());//this will show ouptput as lav that is updated 
		
		
		

	}

}
