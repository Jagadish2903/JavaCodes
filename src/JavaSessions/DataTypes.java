package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
	//Data Types---Type of data 
		//Strict Type
		
		
   //1.Primitive data types: We no need to create or use object to store values(Eg.int x=10) tats why java is not 100% Object oriented language
		//a.Numeric Type
		    //char type:char
		    //integral type:
		           //Integer:byte,short,int,long
		           //floating-point:float,double
		//b.Boolean Type
		       //boolean:True/False
		
	 
		
	//1.1 byte
		//size:1byte=8bits
		//range:-128to127
		//Eg.
		byte b=10;
		byte c=20;
		System.out.println(b+c);
		
	//1.2 short
		//size:2byte=16bits
		//range:-32768to32767
		//Eg.
		 short d=-3265;
		 short e=10;
		 System.out.println(d+e);
		 
	//1.3 int
		//size:4byte=32bits
		//range:-2^31 to 2^31-1
		//Eg.
		int f=-3265;
		System.out.println(f);
	
	//1.4 long
		//size:8byte=64bits
		//range:-2^63 to 2^63-1
		//Eg.
		long l=9789037700l;
		System.out.println(l);			
		
	//1.5 float(we can store int value in float as well,it will add decimal point followed by 0)
	    //size:4byte=32bits
		//range:upto .7 decimal digits
		//Eg.
		float g=97;
		float k=22.57f;
		System.out.println(g+k);	
		
	//1.6 double
		//size:8byte=64bits
		//range:upto .16 decimal digits
		//Eg.
		double m=22.22;
		double n=25.66;
		System.out.println(m+n);				
		//Output is 47.879999999999995 cox its called decimal error in java
		
	//1.7 char(Only single digit should be declared (eg.char c='a')
		//size:2byte=16bits(Since java needs to store some Unicode cahracters (ie,chinese or latin char)
		//range:ASCII Values ranges(a-z=97-122 A-z=65-90 0-9=48-57)
		//Eg.
		char p='v';
		System.out.println(p);		
	    
		//eg.2
		char j='a';
		char z='b';
		System.out.println(j+z);//During arithmetic operation it takes ASCII Values 
		System.out.println((int)j);//To check the ASCII Value of a char
		
		//to find ASCII Value 
		  int zd='c';
				System.out.println(zd);
				
	//1.8 boolean(Only true or false and t or f should be in small since it is a keyward)
		//size:1bit
		//range:true or false
		//Eg.
		boolean isjavacomplex=true;
		boolean iscodecorrect=false;
		if(isjavacomplex){
		System.out.println("No");					
		}else
		{
			System.out.println("yes");
			}
				
	
		
  //2.Non-Primitive data types(String,Class,Objects,Interface)
		
		

	}

}
