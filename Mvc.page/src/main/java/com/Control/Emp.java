package com.Control;

public class Emp {
private String firstName;
private String lastName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
}