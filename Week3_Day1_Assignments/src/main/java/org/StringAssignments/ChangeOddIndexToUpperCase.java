package org.StringAssignments;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		String str = "Testleaf";
		
		str = str.toLowerCase();
		
		String convertedString = "";
		
		char chr[] = str.toCharArray();

		for(int i = 0; i < chr.length; i++) {
			if(i%2 != 0) {
			chr[i] = Character.toUpperCase(chr[i]);
			}
			
			convertedString = convertedString + chr[i];
		
		}
		
		System.out.println("Converted string is : "+ convertedString);
	}

}
