package week2.week2_day2;

public class DuplicateNumberArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,4,8,2,5};
		for(int i = 0;i <arr.length;i++){
	        for(int j = i + 1; j < arr.length; j++) {
	            if(arr[i] == arr[j])  
	                System.out.println(arr[j]); 
	        } 
			
		}
	}
}
