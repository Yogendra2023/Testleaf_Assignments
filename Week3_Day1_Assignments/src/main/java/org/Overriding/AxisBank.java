package org.Overriding;

public class AxisBank extends BankInfo{

	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Recurring deposit interest rate is 5.25 %.");
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
	}
}
