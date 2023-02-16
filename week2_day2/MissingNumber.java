package week2.week2_day2;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int arr[] = {1,2,3,4,6,7,5,9,10};
		
		int sumOfAll = (n * (n+1))/2;
		System.out.println(sumOfAll);
		int sumOfArrayElements   = 0;
		
		for(int i = 0; i<=n-2; i++){
			sumOfArrayElements = sumOfArrayElements + arr[i];
		}
		System.out.println(sumOfArrayElements);
		int missingNumber = sumOfAll - sumOfArrayElements;
		System.out.println(missingNumber);
	}

}
