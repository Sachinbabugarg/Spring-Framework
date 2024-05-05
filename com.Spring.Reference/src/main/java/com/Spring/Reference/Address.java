package com.Spring.Reference;

public class Address {
private String tadd;
private String padd;
private String cadd;
public Address(String tadd, String padd, String cadd) {
	super();
	this.tadd = tadd;
	this.padd = padd;
	this.cadd = cadd;
}
@Override
public String toString() {
	return "Address [tadd=" + tadd + ", padd=" + padd + ", cadd=" + cadd + "]";
}
public String getTadd() {
	return tadd;
}
public void setTadd(String tadd) {
	this.tadd = tadd;
}
public String getPadd() {
	return padd;
}
public void setPadd(String padd) {
	this.padd = padd;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

}
