package org.student;

import org.department.Department;

public class Student extends Department {
	
	
	//Multilevel inheritance
	// Student inherits Department which inherits College
	
	public void studentName() {
		System.out.println("Student Name");
	}
	
	public void studDept() {
		System.out.println("Student Department");
	}
	
	public void studentId() {
		System.out.println("Student ID");
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studDept();
		st.studentId();
	}

}
