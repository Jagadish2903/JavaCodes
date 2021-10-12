package JavaSessions;

public class SwitchStatements {

	public static void main(String[] args) {
		//Logic to launch diff browser
		String browser="Safari";
		//we need to use switch case statement for tat enter switch and press ctrl and space and select switch case statement
		switch (browser) {
		case "Chrome":
			System.out.println("lauching chrome");
			break;//break will break the entire lines and jumps to end if it is absent it will print even default 
		case "Firefox":
			System.out.println("lauching chrome");
			break;
		case "IE":
			System.out.println("lauching chrome");
			break;
		case "Safari":
			System.out.println("lauching chrome");
			break;
		default:
			System.out.println("Please launch correct browser");
			break;
		}

		
		//EQ.2 case sensitive
		String env="msc link 32";
		
		switch (env.toUpperCase()) {//.to upper case will convert all to upper case ,we cannot use .equalsignore case cox it is a comparison case and if we use it will ask for another string
		case "MSC LINK 32":
			System.out.println("lauching 32bit");
			break;//break will break the entire lines and jumps to end if it is absent it will print even default 
		case "MSC LINK 64":
			System.out.println("lauching 64 bit");
			break;
		case "XA LINK":
			System.out.println("lauching XA");
			break;
		default:
			System.out.println("Please launch correct browser");
			break;
		}
	
//we can user parallel execution with multiple browser by using TESTNG 
	
	//Eg.2 To find highest number 
	int x=100;
	int y=200;
	int z=300;
	
	if(x>y && x>z) {//x>y is fase and x>z is true so false && true is false
		            // && is a called as short circuit operator 
		     //if the first condition is not satified it wont check second condition when we use && here x>y is false so it wont check x>z
		     //if condition one is true it will check second condition if x>y true then it will check x>z
		System.out.println("X is highest");
	}else if(y>z)
	{
	System.out.println("y is highest");
	}
	else {
		System.out.println("Z is highest");
	}
	
	//assignment when two numbers are equal
    //scenario 
	
	int p=500;
    int q=700;
    int r=500;
    
    
    if(p==q && q==r) {
    	System.out.println("All numbers are equal");
    }else if(p==q) {
    	 System.out.println("p and q are equal");
    }else if(q==r) {
    	System.out.println("q and r are equal");
    }else if(p==r) {
    	System.out.println("p and r are equal");
    }else {
    	System.out.println("sorry no numbers are equal to one another");
    }
	}

	
	
int z=10;

}
	

    

         

