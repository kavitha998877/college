package com.tnsif.packages;

public class Publicdemo {
	default int a=8;
	public static void main(String[] args) {
		Publicdemo p=new Publicdemo();
		System.out.println(p.a);
		
	}
}