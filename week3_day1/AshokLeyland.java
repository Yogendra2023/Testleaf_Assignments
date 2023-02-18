package week3.week3_day1;

public class AshokLeyland extends Truck{
	public void insideAshokLeyland() {
		// TODO Auto-generated method stub
		System.out.println("Inside AshokLeyland");
	}
	
	public static void main(String[] args) {
		AshokLeyland al = new AshokLeyland();
		al.insideAshokLeyland();
		al.insideTruck();
		al.insideVehicle();
	}
}
