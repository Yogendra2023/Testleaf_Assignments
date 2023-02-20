package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,4,1,2,3,9,10};
		
		List<Integer> arrItems = new ArrayList<>();
		List<Integer> missingNumbers = new ArrayList<>();
		
		for(int i =0; i<arr.length;i++){
			arrItems.add(arr[i]);
		}
		
		int maxNumber = Collections.max(arrItems);
		
		System.out.println("Maximum number is : "+ maxNumber);
		
		for(int j = 1; j<=maxNumber; j++){
			if(!arrItems.contains(j)){
				missingNumbers.add(j);
			}
		}
		
		System.out.println("Missing items are : "+ missingNumbers);
		
	}

}
