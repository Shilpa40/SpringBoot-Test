package com.shilpa.model;

public class Student {

	private Integer rollCode;
	private String firstName;
	private String lastName;
	private String schoolName;
	
	

	public Student(Integer rollCode, String firstName, String lastName, String schoolName) {
		super();
		this.rollCode = rollCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolName = schoolName;
	}

	public Integer getRollCode() {
		return rollCode;
	}

	public void setRollCode(Integer rollCode) {
		this.rollCode = rollCode;
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

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [rollCode=" + rollCode + ", firstName=" + firstName + ", LastName=" + lastName + ", schoolName="
				+ schoolName + "]";
	}

}
