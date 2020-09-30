package com.sbuhack.mediatorapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="User")
public class User{
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String username;
	@Column
	private String password;
	@Column
	private String firstName;
	@Column
	private String middleName;
	@Column
	private String lastName;
	@Column
	private char gender;
	@Column
	private String email;
	@Column
	private  int isMediator;
	
	public int isMediator() {
		return isMediator;
	}
	public void setMediator(int isMediator) {
		this.isMediator = isMediator;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String firstName, String lastName, char gender, String middleName, String email, int isMediator) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.middleName = middleName;
		this.email = email;
		this.isMediator = isMediator;
	}
	
}
