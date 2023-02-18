package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name is Yogendra.");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student department is Information Technology.");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student Id is 205.");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}
}
