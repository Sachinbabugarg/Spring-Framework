package com.Spring.reference1;

import java.util.List;

public class Employee {

private int id;
private String name;
private List<String> list;
private Cars cars;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public Cars getCars() {
	return cars;
}
public void setCars(Cars cars) {
	this.cars = cars;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", list=" + list + ", cars=" + cars + "]";
}
public Employee(int id, String name, List<String> list , Cars cars) {
	super();
	this.id = id;
	this.name = name;
	this.list = list;
	this.cars=cars;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
	
}
