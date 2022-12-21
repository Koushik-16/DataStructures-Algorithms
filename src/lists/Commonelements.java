package lists;

import java.util.ArrayList;

public class Commonelements {
	
	public static ArrayList<Integer> Commonelements(int []a , int [] b, int [] c) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0 , j = 0 , k = 0 ;
 while(i < a.length && j < b.length && k < c.length) {
	 
	 if(a[i] == b[j] && b[j] == c[k]) {
		result.add(a[i]);
		i++;
		j++;
		k++;
	 } else if( a[i] < b[j] ) {
		 i++;
	 } else if( b[j] < c[k]) {
		 j++;
	 } else 
		 k++;
 }
 return result;
		
	}


	public static void main(String[] args) {
		int[] a = {1, 2, 3 ,4 }; 
		int [] b = {2, 5, 7, 9};
		int [] c = {2, 10 , 13, 14};

		System.out.println(Commonelements(a, b, c)); 
		
		
	}

}
