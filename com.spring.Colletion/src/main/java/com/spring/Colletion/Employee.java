package com.spring.Colletion;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
String name;
List<String> address;
Set<Long> phones;
Map<String , String> id;
private Properties props;
public Employee(String name, List<String> address, Set<Long> phones, Map<String, String> id, Properties props) {
	super();
	this.name = name;
	this.address = address;
	this.phones = phones;
	this.id = id;
	this.props = props;
}
public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", phones=" + phones + ", id=" + id + ", props=" + props
			+ "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public Set<Long> getPhones() {
	return phones;
}
public void setPhones(Set<Long> phones) {
	this.phones = phones;
}
public Map<String, String> getId() {
	return id;
}
public void setId(Map<String, String> id) {
	this.id = id;
}

}
