package searching.sorting;

import java.util.ArrayList;

public class Valueequaltoindex {
	
 static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
	        ArrayList<Integer> a = new ArrayList<>();
	        for(int i = 0;i < n; i++) {
	            if(arr[i] == (i+1)) {
	                a.add(arr[i]);
	            }
	        }
	        return a;
	    }

	public static void main(String[] args) {
		
		int [] a = {1, 2 ,3 ,4 ,5, 6 };
		int n = a.length;
		System.out.println(valueEqualToIndex(a, n));

	}

}
