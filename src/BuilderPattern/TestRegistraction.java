package BuilderPattern;

public class TestRegistraction {

	public static void main(String[] args) {
		Registration registration=new Registration("Jagadish","Kumar","#123,street","Chennai","Tambaram",632000,9789037700l,"Jaggu@gmail");
		
		registration.doRegistration(registration);//passing the same object reference
	}

}
