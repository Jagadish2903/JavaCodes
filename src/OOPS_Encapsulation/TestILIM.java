package OOPS_Encapsulation;

public class TestILIM {

	public static void main(String[] args) {
		ILIMTeam obj=new ILIMTeam();//creating a object of first class to access private by calling public method in first class
		
		obj.setName("Sambath");
		obj.setNoofmembers(3);
		obj.setDesignation("Testing exe");
		obj.Senior="Jaggu";
		
		obj.getTeaminfo();//other way without getter and setter
		
		System.out.println(obj.getName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.getNoofmembers());
		System.out.println(obj.Senior);//this is a public in nature so no need to create getter and setter and call it 
		//we can just assign the value directly and print 
		
		
		System.out.println(obj.getTeaminfo());//other way without getter and setter
		}

}
