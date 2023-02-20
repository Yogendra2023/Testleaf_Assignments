package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Jadeja","Sachin","Kambli","Dravid","Yuvraj","Ganguly","Laxman"};
		
		List<String> names = new ArrayList<>();
		
		for(int i =0; i<str.length; i++){
			names.add(str[i]);
		}
		
		Collections.sort(names);
		
		for(int j = 0; j<names.size() ; j++){
			System.out.println(names.get(j));
		}
	}

}
