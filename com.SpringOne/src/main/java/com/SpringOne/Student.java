package com.SpringOne;

public class Student {
public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
String name;
int id;


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

public Student() {
	super();
	// TODO Auto-generated constructor stub
}


}
