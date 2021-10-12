package BuilderPattern;

public class Registration {
   private String firstname;
   private String lastname;
   private String address;
   private String city;
   private String region;
   private int postalcode;
   private long phno;
   private String mail;
   
   
  //Created constructor to avoid creation of unneccesary object
   
   public Registration(String firstname, String lastname, String address, String city, String region, int postalcode,
		long phno, String mail) {
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
	this.city = city;
	this.region = region;
	this.postalcode = postalcode;
	this.phno = phno;
	this.mail = mail;
}
   
   
//Creating getter and Setters
   
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public int getPostalcode() {
	return postalcode;
}
public void setPostalcode(int postalcode) {
	this.postalcode = postalcode;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
   

//Creating a Separate method 

public void doRegistration(Registration reg) {
	System.out.println("First Name entered is "+reg.getFirstname());
	System.out.println("Last Name entered is "+reg.getLastname());
	System.out.println("address entered is  "+ reg.getAddress());
	System.out.println("City entered is  "+reg.getCity());
	System.out.println("region entered is "+reg.getRegion());
	System.out.println("Postal Code entered is "+reg.getPostalcode());
	System.out.println("phone number entered is "+reg.getPhno());
	System.out.println("mail id entered is "+reg.getMail());
}
   
   
   
}
