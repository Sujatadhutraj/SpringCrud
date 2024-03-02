package com.hefshine.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	 private Long id;
    private String name;
    private long phoneNo;
    private int age;
    private String EmailId;
    private String grade;
    
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Long id, String name, long phoneNo, int age, String emailId, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		EmailId = emailId;
		this.grade = grade;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmailId() {
		return EmailId;
	}


	public void setEmailId(String emailId) {
		EmailId = emailId;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", age=" + age + ", EmailId=" + EmailId
				+ ", grade=" + grade + "]";
	}

	
    
}