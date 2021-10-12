package JavaSessions;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		//1. ++ Incremental Operator(Increment by 1)
             //a. post increment(Eg.a++)
		         //eg1.
		         int a=2;
		         int b=a++;
		         System.out.println(a);
		         System.out.println(b);
		         //here Post increment first the value of a will be given to b and then increase the value of a by 1
		         //so result is a=3 and b=2
		         
		         //eg2.
		         int c=-95;
		         int d=c++;
		         System.out.println(c);
		         System.out.println(d);
		         //here Post increment first the value of c will be given to d and then increase the value of c by 1
		         //so result is c=-94 and b=-95
		        
		     //b. pre increment(Eg.++a)
		         //eg1.
		         int e=2;
		         int f=++e;
		         System.out.println(e);
		         System.out.println(f);
		         //here pre increment first it increase the value of e by 1 and then assign value of f 
		         //so result is e=3 and f=3
		         
		         //eg2.
		         int g=-95;
		         int h=g++;
		         System.out.println(g);
		         System.out.println(h);
		       //here pre increment first it increase the value of g by 1 and then assign value of f 
		         //so result is g=-94 and h=-94
		         
		  //2. -- Decremental Operator(Decrement by 1)
	             //a. post Decrement(Eg.a--)
			         //eg1.
			         int i=2;
			         int j=i--;
			         System.out.println(i);
			         System.out.println(j);
			         //here Post decrement first the value of i will be given to j and then decrease the value of i by 1
			         //so result is i=1 and j=2
			         
			         //eg2.
			         int k=-95;
			         int l=k--;
			         System.out.println(k);
			         System.out.println(l);
			       //here Post decrement first the value of k will be given to l and then decrease the value of k by 1
			         //so result is k=-96 and l=-95
			        
			     //b. pre decrement(Eg.--a)
			         //eg1.
			         int m=2;
			         int n=--m;
			         System.out.println(m);
			         System.out.println(n);
			         //here pre decrement first it decrease the value of m by 1 and then assign value of n 
			         //so result is m=1 and n=1
			         
			         //eg2.
			         int o=-95;
			         int p=--o;
			         System.out.println(o);
			         System.out.println(p);
			       //here pre decrement first it decrease the value of 0 by 1 and then assign value of p 
			         //so result is o=-96 and p=-96
			         
			         
			         
	//NB:	Case
			         int q=2;
			         System.out.println(q++);// here the output will be 2 since q is assigned to println and the value of q is 2
			         System.out.println(q);//now the q is increased since in memory in line 80 the value is 2 and now q is 3
			       
	}

}
