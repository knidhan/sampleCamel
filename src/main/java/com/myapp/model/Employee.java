package com.myapp.model;

public class Employee {
private int id;
private String empName;
private String add;
public Employee(int id, String empName, String add) {
	super();
	this.id = id;
	this.empName = empName;
	this.add = add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}



}
