package JavaSessions;

public class FinalKeywordParent {

	public static void main(String[] args) {
		FinalKeywordChild d1=new FinalKeywordChild();//here we are calling the child class by creating a object with tat class name
		d1.name="lav";
		d1.email="lav@gmail";
		d1.number=2365789;
		d1.is_prime=true;
		System.out.println(d1.name+" "+d1.email+" "+d1.number);
		System.out.println(FinalKeywordChild.Category);//here FinalKeywordChild.Category is a static incase if someone changes 
		//FinalKeywordChild.Category="only selected";
		System.out.println(FinalKeywordChild.Category);//now it is changed 
		
		//To stop changing the static value we need to use final keyword in the class level
		//if we write final keyword at class level it will throw error when we try to assign a value later to the variable
		//eg.int i=20;
		//i=10;
		//i=5;
		//if we assign final keyword it wont allow to reassign 
		//Constant variable has to be declared with final keyword
		
		
	}

}
