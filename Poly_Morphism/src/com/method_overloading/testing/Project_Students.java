package com.method_overloading.testing;

public class Project_Students {

	private void student_info(String a, int b, String c) {
		System.out.println("Student Name: =" + a);
		System.out.println("Student Age: =" + b);
		System.out.println("Student Gender: =" + c);
	}

	private void student_info(String d, int e) {
		System.out.println("Stdent Address: =" + d);
		System.out.println("Student Fees: =" + e);
	}

	private void student_info(String f, long g) {
		System.out.println("Student Father Name: =" + f);
		System.out.println("Student Bank Acoount Number: =" + g);
	}

	public static void main(String[] args) {
		Project_Students m = new Project_Students();
		m.student_info("Raj", 27, "Male");
		m.student_info("Salem", 50000);
		m.student_info("Nagarajan", 98362576248l);
	}
}
