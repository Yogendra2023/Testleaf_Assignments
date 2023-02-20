package javaCollection;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am working as a manual test engineer as well as automation test engineer";
		
		String uniqueStr = "";
		
		String duplicateStr = "";
		
		String strarr[] = str.split(" ");
		
		Set<String> strSet = new HashSet<>();
		
		Set<String> duplicatestrSet = new HashSet<>();
		
		for(int i = 0; i< strarr.length; i++){
			boolean addbool = strSet.add(strarr[i]);
			if(!addbool){
				duplicatestrSet.add(strarr[i]);
				
				duplicateStr = duplicateStr + strarr[i] + " ";
			} else {
				uniqueStr = uniqueStr + strarr[i] + " ";
			}
		}
		
		System.out.println("String after removing duplicate words is :"+ uniqueStr);
		
		System.out.println("Duplicate words are :"+ duplicatestrSet);
		
	}

}
