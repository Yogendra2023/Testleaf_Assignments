package week3.week3_day1;

public class Suzuki extends Bike{
	public void insideSuzuki() {
		// TODO Auto-generated method stub
		System.out.println("Inside Suzuki");
	}
	
	public static void main(String[] args) {
		Suzuki sz = new Suzuki();
		sz.insideSuzuki();
		sz.insideBike();
		sz.insideVehicle();
	}
}
