package com.rakesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String mobile;
	@Column
	private String gender;
	@Column
	private String address;
	@Column
	private String country;
	@Column
	private String courses;
	@Column
	private String password;
	
	
	public Student(int id, String name, String email, String mobile, String gender, String address, String country,
			String courses, String password)
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
		this.country = country;
		this.courses = courses;
		this.password = password;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCourses() {
		return courses;
	}


	public void setCourses(String courses) {
		this.courses = courses;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	
	
}
