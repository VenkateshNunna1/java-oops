package com.java.StaticAndNonstatic;
class Human{
	String name;
	String serName;
	String gender;
	int age;
	Human(String name,String serName,String gender,int age){
		this.name = name;
		this.serName=serName;
		this.gender=gender;
		this.age=age;
	}
	void displayHuman() {
		System.out.println(name + serName + gender + age);
	}
}
class Teacher extends Human{
     String designation;
     String companyName;
	public Teacher(String name, String serName, String gender, int age, String designation, String companyName) {
		super(name, serName, gender, age);
		this.designation = designation;
		this.companyName = companyName;
	}
	void displayTeacher() {
		super.displayHuman();
		System.out.println(designation + companyName);
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		  Teacher t = new Teacher("venky","Nunna","male",23,"java developer","jspiders");
		  t.displayTeacher();
	}

}
