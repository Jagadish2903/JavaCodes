package HashmapConcepts;

import java.util.HashMap;

public class AmazonWeb {
	
	
	public void doLogin(String un,String pwd) {
		System.out.println(un+":"+pwd);
	}
	
	public HashMap<String,String> getcredentials() {
		HashMap<String,String>credMap=new HashMap<String,String>();
		
		//key is the role 
		//value is username and password for login
		credMap.put("Customer", "Jaggu@gmail:Jaggu123");
		credMap.put("vendor", "vendor@gmail:vendor123");
		credMap.put("partner", "Partner@gmail:Partner123");
		credMap.put("admin", "admin@gmail:admin123");	
		return credMap;
	}

	public static void main(String[] args) {
		AmazonWeb aw=new AmazonWeb();
		//System.out.println(aw.getcredentials());
		String cred=aw.getcredentials().get("partner");
		String Username=cred.split(":")[0];
		String Password=cred.split(":")[1];
		
		aw.doLogin(Username, Password);
		

	}

}
