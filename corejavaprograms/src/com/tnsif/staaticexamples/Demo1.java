package com.tnsif.staaticexamples;

public class Demo1 {
	public static void main(String[] args) {
		Student.change();

		Student s1=new Student(1,"kavitha");
		Student s2=new Student(2,"deepthi");
		Student s3=new Student(3,"priya");
s1.display();
s2.display();
s3.display();

	}
}
