package Leavs.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int user_id; 
  private String user_name;
  private String user_dob;
  private String user_email;
  private String user_password;
  private String user_role;
  private Date created_on;
  private int created_by;
  private int company_id;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_dob() {
	return user_dob;
}
public void setUser_dob(String user_dob) {
	this.user_dob = user_dob;
}
public String getUser_email() {
	return user_email;
}
public void setUser_email(String user_email) {
	this.user_email = user_email;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public String getUser_role() {
	return user_role;
}
public void setUser_role(String user_role) {
	this.user_role = user_role;
}
public Date getCreated_on() {
	return created_on;
}
public void setCreated_on(Date created_on) {
	this.created_on = created_on;
}
public int getCreated_by() {
	return created_by;
}
public void setCreated_by(int created_by) {
	this.created_by = created_by;
}
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
  
	
}
