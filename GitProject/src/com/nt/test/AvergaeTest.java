package com.nt.test;

import com.nt.entity.Student;

public class AvergaeTest {

	public static void main(String[] args) {
		System.out.println("Your Percentage is::"+new Student().calculateStudentPercentage(new Float[] {70f,70f,70f,80f,80f,80f}));

	}

}
