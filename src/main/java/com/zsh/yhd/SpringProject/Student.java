package com.zsh.yhd.SpringProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int age;
	private String name;
	private List<String> cources;
	
	@Autowired(required=false)
	private Book book;

//	public Student(int age, String name, List cources) {
//		super();
//		this.age = age;
//		this.name = name;
//		this.cources = cources;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getCources() {
		return cources;
	}

	public void setCources(List cources) {
		this.cources = cources;
	}

//	@Override
//	public String toString() {
//		return "Student [age=" + age + ", name=" + name + ", cources=" + cources + "]";
//	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", cources=" + cources + ", book=" + book + "]";
	}
	
}
