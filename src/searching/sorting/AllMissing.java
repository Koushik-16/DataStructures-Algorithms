package searching.sorting;
import java.util.ArrayList;

public class AllMissing {
	
	public static ArrayList<Integer> missing(int a []){
		ArrayList<Integer> res = new ArrayList<>();
		int i = 0 ;
		while(i < a.length) {
			if(a[a[i]-1] != a[i] ) {
				swap(a, i, a[i] -1);
			} else {
				i++;
			}
			}
		for(int k = 0; k < a.length ; k++ ) {
			if(k + 1 != a[k]) {
				res.add(k+1);
			}
		}
		return res;
	}
	private static void swap(int[] a, int i, int j) {
	     int temp = a[i];
	     a[i] = a[j];
	     a[j] = temp;
	}
	public static void main(String[] args) {
		int a [] = {4,3, 2, 7, 8, 2, 3, 1};
		ArrayList<Integer> res = missing(a);
		for(int i = 0 ; i < res.size() ; i++) {
			System.out.print(res.get(i) + " ");
		}
	}
}
