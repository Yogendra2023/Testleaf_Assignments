package org.StringAssignments;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "Testleaf";
		str = str.toLowerCase();
		String newstr = "";
		char chararray[] = str.toCharArray();
		for(int i=0; i<chararray.length; i++) {
			if(newstr.indexOf(chararray[i]) == -1) {
				
				newstr = newstr + chararray[i];				
			}
		}
		System.out.println(newstr);
	}

}
