package com.method_overloading.testing;

public class Poly_Example {
	private void child(int a) {
		System.out.println("the value of int = "+ a);
	}
	private void child(int a, String b) {
		System.out.println("the value of int =" + b);
		System.out.println("the value of String =" + b);
	}
	private void child(String b) {
		System.out.println("the value of string =" + b);
	}
	private void child(String b, int a) {
		System.out.println("the value of string =" + b);
		System.out.println("the value of int =" + a);
	}
	public static void main(String[] args) {
		Poly_Example m = new Poly_Example();
		m.child(75);
		m.child(90,"500");
		m.child("mouli raj");
		m.child("smr", 60);
	}

}
