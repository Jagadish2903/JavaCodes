package ConstructorConcepts;

import java.util.Arrays;

public class TestBrowser {

	public static void main(String[] args) {
		String[] addedplugins=new String [] {"Chropath","Adobe","Applitools"};
		
	 Browser obj1=new Browser("Chrome",10.55,addedplugins);
	 System.out.println(obj1.getName()+" "+obj1.getVersion()+" "+Arrays.toString(addedplugins));
	 
	 
	 String[] addedplugins1=new String [] {"flash","photoshopext"};
	 obj1.setName("Firefox");
	 obj1.setVersion(65.56);
	 obj1.setPlugins(addedplugins1);
	 System.out.println(obj1.getName()+" "+obj1.getVersion()+" "+Arrays.toString(addedplugins1));
	 
	 
	 
	}
}

		
		
		
		

	


