package javaCollection;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Engineer";
		char strarr[] = str.toCharArray();
		
		Set<Character> chrset = new HashSet<>();
		Set<Character> uniquechrset = new HashSet<>();
		
		
		for(int i =0; i<strarr.length; i++){
			boolean chrsetbl = chrset.add(strarr[i]);
			if(!chrsetbl){
				uniquechrset.remove(strarr[i]);
			} else {
				uniquechrset.add(strarr[i]);
			}
		}
		System.out.println("Unique Characters are : "+ uniquechrset);
	}

}
