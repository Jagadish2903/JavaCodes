package StringManipulations;

public class MethodsinString {

	public static void main(String[] args) {
		String str ="I am";
		String str2="This is my Java Code and i am so happy";
		 
		
		
		//1. .length() --To give length 
		System.out.println(str.length());//It will give length of the string(Space will also be considered into count)
		//String is a Collection of Characters ..Internally it will have Char array //Output is 4 
		//Lowest Index is always 0
		//highest Index is length-1
		
		
		//2.   .charAt() --To give the character at specfic index
		System.out.println(str.charAt(2));//It will give a at index 2
		System.out.println(str.charAt(1));//it will give blank space as output cox at index 1 space is there
		//System.out.println(str.charAt(-1));//it will throw String IndexOutof Bound exception (Incase of Static Array it is Index out of bound)(Incase of Dynamic Array it is Array Index out of Bound)
		
		//3.  .indexof(); ---To give the Index of the character(position of the character -first occurance)
		System.out.println(str.indexOf('m'));
		System.out.println(str2.indexOf('i'));//i is present in Str2 3 times so wen we run this it will always show the first occurence i.e 2
		
		
		//4.  .indexof(str,from index)--It will give the Index of character from the index we are giving
		System.out.println(str2.indexOf('i', 7));//it will give 25 as output cox i is in 2,5,25 positions and we have given after 7th position
		System.out.println(str2.indexOf('a', 15));
		//the above code is hotcoded incase if anyone adds anything to the value ..the result will be wrong so deriving it in formula
		System.out.println(str2.indexOf('i', str2.indexOf('i')+1));//gives the second occurance of i 
		//to find the third occurance
		int s=str2.indexOf('i', str2.indexOf('i')+1);
		System.out.println(str2.indexOf('i', (s)+1));//to find the third occurance of i 
		
		
		//Note :Index of charcter of string which is not present in the string will always give -1
		System.out.println(str2.indexOf("C#"));
		
		
		//5. .contains--it will return boolean 
		String s1="This is name";
		System.out.println(s1.contains("This"));//It will give true 
		
		//6. .equals --It will compare the strings 
		
		String s2="Welcome";
		String s3="WELCOME";
		System.out.println(s2.equals(s3));//it will give false cox its case sensitive
		System.out.println(s2.equalsIgnoreCase(s3));//It will give true
		
		
		//7.  .trim ---It will trim the spaces in the corners 
		String na="          Hi name is Lav      ";
		System.out.println(na.trim());//It will trim the spaces in the corners  so output is Hi name is Lav
		
		//8. .replaceall   (\\s or \\s+   -expression) --It will remove all the white spaces in the string 
		System.out.println(na.replaceAll("\\s+", ""));//output is HinameisLav
		//diff between using \\s and \\s+ is \\s will check everyword for spaces \\s+will collect all the spaces and remove the spaces 
		//so \\s+ is best interms of performance 
		
		
		//9. .replace ---It will replace with new input
		String dob ="01-01-2021";
		System.out.println(dob.replace("-", "/"));//here the output will be 01/01/2021
		
		//10. .toUpperCase and .toLowercase()---to convert into lowercase or uppercase
		String ab="Hi name is shiva";
		System.out.println(ab.toLowerCase());
		System.out.println(ab.toUpperCase());
		
		
		//11. .split --It will split the array on the basis of input and store it in a String array
		String sp="Jaggu_Lav_Usha_Joy_lakshmi";
		System.out.println(sp.split("_"));//since the return type of split is a string aray when we print it,will show the memory location only 
		String []name=sp.split("_");
		System.out.println(name[0]);//it will show output in 0th index //Jaggu
		
		//To Print all the values use for loop 
		for(String e:name) {
			System.out.println(e);
		}
		
		
		//eg 2 for Split
		
		String mu="XXTestingXXxxXseleniumxXxXAutomation";
		String [] name2=mu.split("xX");
		System.out.println(name2[0]);//the output is XXTestingXXx
		System.out.println(name2[1]);//selenium
		try{
			System.out.println(name2[4]);//arrayoutofbound
		}catch(Exception e) {
			System.out.println("AIOB");
		}
		
		

	}

}
