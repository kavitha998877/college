package com.tnsif.superkeyword;

public class Demo extends Superex{
	int a=70;
	void display(){
		System.out.println(a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
	
	}

}
