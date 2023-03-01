package com.method_overloading.testing;

public class Poly_Example1 {
	private void Overloading(String a, String b,int c) {
		System.out.println("College Name : " + a);
		System.out.println("Student Name : " + b);
		System.out.println("Age : " + c);
	}
	private void Overloading(String a, long b) {
		System.out.println("Department : " + a);
		System.out.println("Phone Number : " + b);
	}
	public static void main(String[] args) {
		Poly_Example1 m = new Poly_Example1();
		m.Overloading("Anna University", "Mouliraj", 28);
		m.Overloading("ECE", 8926549886l);
	}


}
