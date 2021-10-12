package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassB {

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		ArrayList<String> name=obj.getteamlist("ILIM");
		System.out.println(name);

		
		if(name.size()==3) {
			System.out.println("There are three members ");
		}
		
		if(name.contains("Sambath")) {
			System.out.println("Yes Sambath is a member");
		}
		Object[] name2=obj.getStudentInfo("Vikram");
		
		System.out.println(name2);//it will print memory address
		System.out.println(Arrays.toString(name2));//this will give the ans for vikram .....//arrays.toString method
	}

	
}
