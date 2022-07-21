package com.globallogic.helloworld;

class classexe {
	public String name;
	private int id;
	private int age;
	private int marks;
	private String status;
	
	@Override
	public String toString() {
		return "classexe [name=" + name + ", id=" + id + ", age=" + age + ", marks=" + marks + ", status=" + status
				+ "]";
	}
	public classexe(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		classexe ex = new classexe("Varun");
		ex.setAge(20);
		ex.setId(1);
		ex.setMarks(1000);
		ex.setStatus("Pass");
		System.out.println(ex.toString());
	}
	
}

