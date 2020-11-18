package com.nt.entity;


public class Student {
	
	public Float calculateStudentPercentage(Float[] marks) {
		float sum=0;
		for(float sub:marks) {
			sum=sum+sub;
		}
		return (sum/6);
	}

}
