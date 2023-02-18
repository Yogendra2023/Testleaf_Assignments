package week3.week3_day1;

public class MyCalculator extends Calculator {
	public static void main(String[] args) {
		MyCalculator mycalc = new MyCalculator();
		mycalc.sub();
		mycalc.mul("Testleaf", 20, 34.78F);
		mycalc.mul(2, 3);
	}
}
