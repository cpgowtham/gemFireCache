package com.pojo;

import java.io.Serializable;

public class Employee implements Serializable{
	
 private String username;
 
 private String password;
 
 public Employee(String user, String pwd) {
	// TODO Auto-generated constructor stub
	 this.username=user;
	 this.password=pwd;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
 
 

}
