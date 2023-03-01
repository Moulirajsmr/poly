package com.method_overriding.test;

public class Class2 extends Class1 {
	
	@Override
	public void father() {		
		System.out.println("God");
		super.father();
	}
	@Override
	public void mother() {
		System.out.println("Goddess");
		super.mother();
	}
	public static void main(String[] args) {
		Class2 m = new Class2();
		m.father();
		m.mother();
	}
	
	

}
