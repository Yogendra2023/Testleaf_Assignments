package javaCollection;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Testleaf is a good learning institute";
		char strarr[] = str.toCharArray();
		String newString = "";
		Set<Character> newchrset = new HashSet<>();
		
		
		for(int i =0; i<strarr.length; i++){
				boolean strbl = newchrset.add(str.charAt(i));
				if(strbl){
					newString = newString + str.charAt(i);
				}
		}
		
		

		System.out.println("String after removing duplicate characters is : "+ newString);
	}

}
