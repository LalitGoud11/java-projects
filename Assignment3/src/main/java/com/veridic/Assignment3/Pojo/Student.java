package com.veridic.Assignment3.Pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private String name;
	private int rollno;
		
	public Student() {
		super();
	}
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
}
