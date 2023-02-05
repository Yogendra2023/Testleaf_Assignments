package week1.day2;

public class IsPrime {
public static void main(String[] args) {
	int num = 27;
	boolean iflag = false;
	for(int i = 2; i<=num-1; i++) {
		if(num%i==0) {
			iflag = true;
			break;
		}
		
		if(iflag == false) {
			System.out.println(num +" is a prime number");
		} else {
			System.out.println(num +" is not a prime number");
		}
	}
}
}
