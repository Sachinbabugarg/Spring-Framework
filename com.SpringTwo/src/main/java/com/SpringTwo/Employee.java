package com.SpringTwo;

public class Employee {
int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public Employee(int id, String ename, double sal) {
	super();
	this.id = id;
	this.ename = ename;
	this.sal = sal;
}
String ename;
double sal;
}

