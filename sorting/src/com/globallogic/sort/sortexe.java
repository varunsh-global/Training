package com.globallogic.sort;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Student implements Comparable<Student>{

	private String name;
	private int rollno;
	private int age;
	private String status;
	
	
	public Student(String name, int rollno, int age, String status) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.status = status;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + ", status=" + status + "]";
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getRollno()>o.getRollno()){
			return 1;
		}
		else if(this.getRollno()<o.getRollno()){
			return -1;
		}
		else{
			return 0;
		}
	}
}

public class sortexe {
	public static void main(String[] args){
		ArrayList<Student> ls = new ArrayList<Student>();
		ls.add(new Student("Van",50,22,"Pass"));
		ls.add(new Student("Alex",2,23,"Pass"));
		ls.add(new Student("Mic",24,21,"Pass"));
		ls.add(new Student("Zak",61,20,"Pass"));
		
		Collections.sort(ls,new SortRollno());
		
		ls.forEach(System.out::println);
		
	}

}
