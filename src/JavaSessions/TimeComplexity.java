package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
    //Time Complexity --->time taken to execute the code 
		int i=1; //here time complexity is O(1) 
		int k=5; //here time complexity is O(1) 
		//The above cases are called Constant Time
		
		//Hence Constant time =O(1)
		
		
		//Time Complexity for for loop
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		//here first j=1 will be executed hence 1
		//then condition j<=10 will be executed hence n since it can be any value tom 
		//then  syso will be executed n times 
		//then j++ is executed so again n
		
		//generalising the value 1+n+n+n
		//1+3n
		//since 1 is very less number compared to 3n we are ignoring it so 3n
		//again removing constant number 3 so it will be n
		//hence  Time complexity will be O(n)
		//it is called as linear equation
		
		//Time Complexity for multiple for loop
		for(int y=1;y<=10;y++) {
			for(int z=1;z<=10;z++) {
				System.out.println(y+" "+z);	
			}
			
		}
		//here first taking first bracket 
                // so y=1 will be executed hence 1
				//then condition y<=10 will be executed hence n since it can be any value tom  
				//then j++ is executed so again n
		//now taking second bracket
		
		//here first z=1 will be executed hence 1
				//then condition z<=10 will be executed hence n since it can be any value tom 
				//then  syso will be executed n times 
				//then z++ is executed so again n
		
		
		//finalyzing 
		//(1+n+n)(1+n+n+n)
		//(1+2n)(1+3n)           ---(a+b)(a+b)=a^2 +2ab +b^2
		//(1+3n+2n+6n^2)
		//1+5n+6n^2
		//6n^2 +5n
		//n(6n+5) taking n common 
		//ignoring number so 6n^2
		//again ignoring 6 so it will be n^2
		//Time complexity will be O(n^2)
		//it is called quadratic equation
		
		
		
		//Eg for O(Log n) is binary search 
		
     
	}

}
