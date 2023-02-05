package week1.day2;

public class Car {

		public static void main(String[] args) {
			
			Car obj = new Car();
			int regno = obj.getRegistrationNumber();
			System.out.println(regno);
			String ownername = obj.getOwnerName();
			System.out.println(ownername);
			obj.printCarModel();
			boolean punctured = obj.isPunctured();
			System.out.println(punctured);
			int substract = obj.getSubstract(7,4);
			System.out.println(substract);
			int multiply = obj.getMultiply(2,3,4);
			System.out.println(multiply);
			int divide = obj.getDivide(6,2);
			System.out.println(divide);
		}
		public int getRegistrationNumber() {
			int lastFourDigirRegNo = 1234;
			return lastFourDigirRegNo;
		}
		
		private String getOwnerName() {
			String owner = "Yogendra";
			return owner;
		}
		
		void printCarModel() {
			System.out.println("MAHINDRA");
		}
		
		public boolean isPunctured() {
			return false;
		}
		
		public int getSubstract(int b,int c) {
			return b-c;
		}
		
		public int getMultiply(int b,int c, int d) {
			return b*c*d;
		}
		
		public int getDivide(int b,int c) {
			return b/c;
		}

}
