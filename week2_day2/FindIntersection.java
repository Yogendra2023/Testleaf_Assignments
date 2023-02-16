package week2.week2_day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstarray[] = {1,3,5,7,9,10};
		int secondarray[] = {3,4,5,6,7,9,11};
		int intersectionarray[] = new int[firstarray.length+secondarray.length];
		int k = 0;
		for(int i = 0; i< firstarray.length; i++){
			for(int j = 0; j<secondarray.length; j++){
				if(secondarray[j] == firstarray[i]){
					intersectionarray[k] = secondarray[j];
					k++;
				}
			}
		}
		for(int a=0;a<k;a++){
			System.out.println(intersectionarray[a]);
		}
	}

}
