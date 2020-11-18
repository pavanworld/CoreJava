package com.nt.entity;


public class Student {
	
	public Float calculateStudentPercentage(Float[] marks) {
		float sum=0;
		for(float sub:marks) {
			sum=sum+sub;
		}
		return (sum/6);
	}
	
	public void m1() {
		System.out.println("Student.m1()---abcd");
	}

}
