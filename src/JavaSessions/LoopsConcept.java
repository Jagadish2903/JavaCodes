package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//Three types
		//1.while loop
		//2.for loop
		//3.Do while
		
		//1.While loop (It will continue to print untill condiition fails)
		  //Use cases 
		  //1.When the no of iteration are not fixed we will be using while loop(eg.no of products in amazon with respect to festival)
		  // 2.we can use the while loop when in the scenario were a button could be visible after 5 sec (eg.while(iselementpresent=true)
		 //3.Pagination(if the pages depends on day which means varies)
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;//if we dont give i++ it will continue to execute untill we terminate the JVM
			//++i;//we can write ++i also 
			
		}
		
		System.out.println("_______");
		//eg WAP to print odd numbers 
		int j=1;
		while(j<=10) {
			System.out.println(j);
			//j=j++;//if we dont give j++ it will continue to execute untill we terminate the JVM
			j=j+2;//to print odd numbers 
			
		}
		 
		//eg.WAP to print numbers divisible by 5
		int k=1;
		while(k<=100) {
			if (k%5==0) {
				System.out.println(k);
			}
			k++;
		}
		
		
		//Unreachable code: Java Gives warning to the user thta this code cannot be reached since the condiiton is declared as false
		//eg.
		//while(false) {
			//System.out.println("hi");
		//}
		
		//2.for loop
		//syntax for(int i=0:i<=5;i++){ }
		
		//Use Cases :
		//1.when the iteration is known 
		//2.iterating array and arraylist we use for loop
		//3.Data driven(import data from excel where no of rows and columns are known
		
		
		for(int l=2;l<=5;l++) {
			System.out.println("welcome");//it will print 4 times coz initialized as 2 and then incremented till 5
		}
		
		//infinite loop using for loop
		
//		for(int m=2;m<=5;) {
//			System.out.println("wow");//it will print infinte loop cox no incremental given
			//m++ we can give incremental here also it will work 
			
//		}
		
		
		//WAP to print abcd till z
		
		for(char c='a';c<='z';c++) {
	 System.out.println(c);	//it will print abcd vertically 
	 //System.out.print(c);//it will print abcd horizontally ...NB:ln is used to print the code in next line
		}
		
	//WAP to print ASCII Value for abcd till z
		
		for(int c='a';c<='z';c++) {//we use int here to get ASCII value
	 System.out.println(c);	//it will print abcd vertically 
		}
		
	   	
	//Note: we cannot compare String in for loop cox arithemtic operations are done only for primitive data type and String is non primitive
	
	//3.Do while loop
	// first it will print the statement and then checks the condition 
	//so in this loop it will execute the statement atleast once even if condition fail

	//USe cases 
	//1.Pagenation
	//2.Title of the page should be printed by default
	
	
	//Cases
	//Can we use loop with break? Yes 
	//eg
	for(int q=4;q<=100;q++) {
		if(q%5==0) {
			System.out.println("hi");
			break;
		}
		
	
		
	}
}
}
