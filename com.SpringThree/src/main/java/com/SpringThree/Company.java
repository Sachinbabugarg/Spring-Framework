package com.SpringThree;

public class Company {
String name;
int id;
String cname;
@Override
public String toString() {
	return  "name" + "=" + name + "," +"id"+ "="  + id + "," + "cname" +"=" +  cname + "";
}
public Company() {
	super();
	// TODO Auto-generated constructor stub
}
public Company(String name, int id, String cname) {
	super();
	this.name = name;
	this.id = id;
	this.cname = cname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
}

	
	

