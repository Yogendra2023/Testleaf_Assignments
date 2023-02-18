package org.StringAssignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String str = "I am working in Chennai as a Software Test Engineer";
		String strarr[] = str.split(" ");
		String reverseString = "";

		for(int i = 0; i<strarr.length; i++) {
			if(i%2!=0) {
				char chrarr[] = strarr[i].toCharArray();
				for(int j = chrarr.length - 1; j >= 0; j--) {
					reverseString = reverseString + chrarr[j];
				}
				reverseString = reverseString +" ";
			} else {
				reverseString = reverseString + strarr[i] +" ";
			}
		}

		System.out.println(reverseString);
				
	}
}
