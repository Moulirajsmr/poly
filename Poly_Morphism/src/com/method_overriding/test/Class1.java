package com.method_overriding.test;

public class Class1 {
	
	public void father() {
		System.out.println("The Hero");

	}
	public void mother() {
		System.out.println("The Heroine");

	}
	public static void main(String[] args) {
		Class1 x = new Class1();
		x.father();
		x.mother();
	}

}
