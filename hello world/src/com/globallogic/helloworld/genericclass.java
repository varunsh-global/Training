package com.globallogic.helloworld;


class Gen<W,X,Y,Z,A>{
	W name;
	X id;
	Y rollno;
	Z status;
	A age;
	public Gen(W name, X id, Y rollno, Z status, A age) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
		this.status = status;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Gen [name=" + name + ", id=" + id + ", rollno=" + rollno + ", status=" + status + ", age=" + age + "]";
	}
	
	
}

public class genericclass {
	public static void main(String[] args){
	
	Gen<String,String,String,String,String> exe1 = new Gen<String,String,String,String,String>("1","2","3","4","5");
	Gen<Integer,Integer,Integer,Integer,Integer> exe2 = new Gen<Integer,Integer,Integer,Integer,Integer>(1,2,3,4,5);
	Gen<String,Double,Integer,String,Integer> exe3 = new Gen<String,Double,Integer,String,Integer>("Varun",20.0,47,"Pass",22);
	System.out.println(exe1.toString());
	System.out.println(exe2.toString());
	System.out.println(exe3.toString());
	}

}
