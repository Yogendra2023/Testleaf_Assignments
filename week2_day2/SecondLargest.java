package week2.week2_day2;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,10,3,1};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}
