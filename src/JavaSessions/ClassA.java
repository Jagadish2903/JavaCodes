package JavaSessions;

import java.util.ArrayList;

public class ClassA {
	
	//WAF to get the teamlist 
	//return team list
	public ArrayList<String> getteamlist(String Team_member) {
		
		System.out.println("The entered team is "+Team_member);
		ArrayList<String> getteamlist=new ArrayList <String>();
		
		if(Team_member.equals("ILIM")){
			getteamlist.add("Jaggu");
			getteamlist.add("Sambath");
			getteamlist.add("Santhosh");
		}else if(Team_member.equals("Ewizard")) {
			getteamlist.add("Paramesh");
			getteamlist.add("Auguestine");
		}else if(Team_member.equals("Invoice")) {
			getteamlist.add("Aravind");
			getteamlist.add("Sarath");
		}else if(Team_member.equals("Documentation")) {
			getteamlist.add("sai");
			getteamlist.add("Gowtham");
		}else {
			System.out.println("Please enter correct team name");
		}
		
		return getteamlist;
	}
	
	
	
	//WAF input param --student name--String
	//Return Static Array--Object Array
public Object[] getStudentInfo(String StudentName)
{
	System.out.println("The Student Name is "+StudentName );
	Object info[]=new Object[3];
	
	if(StudentName.equals("Vikram")) {
		info[0]="Vikram sharma";
		info[1]=20;
		info[2]="QA";	
	}else if(StudentName.equals("Sai")) {
		info[0]="Sai sha";
		info[1]=26;
		info[2]="dev";
		
	}else if(StudentName.equals("Mani")) {
		info[0]="Mani S";
		info[1]=27;
		info[2]="dev";
		
	}else {
		System.out.println("Please enter correcct name ");
	}
	return info;
}
}
