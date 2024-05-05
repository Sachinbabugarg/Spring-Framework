package com.example.demospring.entities;

public class Course {
   
	private int id;
	private String title;
	private String discription;
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", discription=" + discription + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String title, String discription) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
	}
	
	
}
