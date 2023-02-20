package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,9,8,7,12,5,4,13,3,4,7,9};
		
		List<Integer> arritems = new ArrayList<>();
		
		for(int i =0; i<arr.length; i++){
			arritems.add(arr[i]);
		}
		
		Collections.sort(arritems);
		
		int reqditem = arritems.size()-2;
		System.out.println(arritems.get(reqditem));
	}

}
