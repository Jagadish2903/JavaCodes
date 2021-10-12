package ConstructorConcepts;

public class Browser {
 private String name;
 private double version;
 private String[] plugins;
 
 
 //created Constructor to restrict creation of unnecessary objects
 public Browser(String name,double version,String[] plugins) {
	this.name=name;
	this.version=version;
	this.plugins=plugins;	 
 }

 
//Created setter and getter just in case user wants to change the input parameters

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getVersion() {
	return version;
}


public void setVersion(double version) {
	this.version = version;
}


public String[] getPlugins() {
	return plugins;
}


public void setPlugins(String[] plugins) {
	this.plugins = plugins;
}
 

	

	
 
 
 
	
}


