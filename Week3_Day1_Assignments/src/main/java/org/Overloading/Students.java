package org.Overloading;

public class Students {

	public void getStudentInfo(int studentId) {
		// TODO Auto-generated method stub
		System.out.println("Student Id is : "+ studentId);
	}
	
	public void getStudentInfo(int studentId, String studentName) {
		// TODO Auto-generated method stub
		System.out.println("Student Id is : "+studentId+" and Student Name is : "+ studentName +".");
	}
	
	public void getStudentInfo(String studentEmail, long studentPhoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Student email is : "+studentEmail+" and Student mobile number is : "+ studentPhoneNumber +".");
	}
	
	public static void main(String[] args) {
		Students sts = new Students();
		sts.getStudentInfo(205);
		sts.getStudentInfo(205,"Yogendra");
		sts.getStudentInfo("auto@testleaf.com", 7896512345L);
	}
}
