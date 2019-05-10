package hello;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="users" ,schema = "cinema")
public class User implements Serializable{
public static final long serialVersionUID = 1L;

@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private Long userId;

@Column(name="name")
private String name;

@Column(name="lastName")
private String lastName;

@Column(name="password")
private String password;

@Column(name="email")
private String email;

@Column(name="role")
private String role;

@Column(name = "active")
private boolean active;
public User() {
	
}

public User(User user) {
	this.userId = user.userId;
	this.email = user.email;
	this.password = user.password;
	this.role = user.role;
	
}

public Long getUserid() {
	  return userId;
	 }
	 
	 public void setUserid(Long userid) {
	  this.userId = userid;
	 }
	  
	 public String getPassword() {
	  return password;
	 }
	 
	 public void setPassword(String password) {
	  this.password = password;
	 }
	  
	 public String getEmail() {
	  return email;
	 }
	 
	 public void setEmail(String email) {
	  this.email = email;
	 }
	 

	 
	 public void setRole(String role) {
		 this.role = role;
	 }
	 public String getRole() {
		 return role;
	 }
	 public void setActive(boolean active) {
		 this.active = active;
	 }
	 public boolean getActive() {
		 return active;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setLastName(String lastName) {
		 this.lastName = lastName;
	 }
	 public String getLastName() {
		 return lastName;
	 }
}
