package com.tnsif.staaticexamples;

public class Student {
	int rollno;
	String name;
	static String college="Sriindu";
	static void change() {
		college="btech";
	
	}
	Student(int r,String n){
		rollno=r;
		name=n;
		
	}
void display() {
	System.out.println(rollno +" "+name+" "+college);
}
}
