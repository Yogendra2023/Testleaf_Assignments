package week3.week3_day1;

public class StringReverse {
	
	public static void main(String[] args) {
		String str = "TestLeaf";
		
		char charr[] = str.toCharArray();
		
		for(int i = charr.length -1 ; i>=0 ; i--){
			System.out.print(charr[i]);
		}
	}

}
