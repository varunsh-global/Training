package com.globallogic.sets;
import java.util.*;


class Employee{
	public int id;
	public String name;
	public int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class setexe {
	public static void main(String[] args){
		TreeSet<Employee> s = new TreeSet<Employee>(new Sortid());
		Employee e1 = new Employee(21,"Amit",23);
		s.add(e1);
		s.add(new Employee(5,"Sumit",21));
		s.add(new Employee(97,"Bunty",27));
		s.add(new Employee(63,"Zak",25));
		s.add(new Employee(57,"Mintu",24));
		for(Employee emp:s){
			System.out.println(emp.id);
		}
		s.remove(e1);
		System.out.println(s.contains(e1));
	}

}
