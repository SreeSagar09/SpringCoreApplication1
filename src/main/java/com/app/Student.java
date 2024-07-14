package com.app;

public class Student {
	private Integer sId;
	private String sName;
	private Integer age;
	private String course;
	
	public Student() {
		super();
	}

	public Student(Integer sId, String sName, Integer age, String course) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", age=" + age + ", course=" + course + "]";
	}
	
}
