package recursion;

import java.util.HashSet;
import java.util.Set;

public class question {
	
	static Set<String> set = new HashSet<>();

	public static void main(String[] args) {

//		int a [][] ={{1 , 1 , 1 , 1 , 1 , 1 , 1 , 1},
//				     {1 , 1 , 1 , 1 , 1 , 1 , 0 , 0},
//				     {1 , 0 , 0 , 1 , 1 , 0 , 1 , 1},
//				     {1 , 2 , 2 , 2 , 2 , 0 , 1 , 0},
//				     {1 , 1 , 1 , 2 , 2 , 0 , 1 , 0},
//				     {1 , 1 , 1 , 2 , 2 , 2 , 2 , 0},
//				     {1 , 1 , 1 , 1 , 1 , 2 , 2 , 1},
//				     {1 , 1 , 1 , 1 , 1 , 2 , 2 , 1},
//	                  };
//	       floodFill(a , 4, 3, 3, 2);
//	    printMatrix();
		permutations("abcd", 0 , 3);
}
		static void permutations(String s, int l, int r) {
			if(l== r) {
				if(set.contains(s)) return;
				set.add(s);
				System.out.println(s);
				return;
			}
			for(int i =l; i <= r; i++) {
				s = interchangeChar(s, l, i);
				permutations(s, l+1, r);
				s = interchangeChar(s , l , i);
			}
		}
		static String interchangeChar(String s , int a, int b) {
			char array [] = s.toCharArray();
			char temp = array[a];
			array[a] = array[b];
			array [b] = temp;
			return String.valueOf(array);
		}
//	static void floodFill(int a [][], int r , int c, int toFill , int prevFill ) {
//	    int rows = a.length;
//		int cols = a[0].length; 
//		
//		if(r < 0 || r >= rows || c < 0 || c >= cols) {
//			return;
//		}
//		if(a[r][c] != prevFill) {
//			return;
//		}
//		
//		a[r][c] = toFill;
//		
//		floodFill(a, r-1 , c , toFill, prevFill);
//		floodFill(a , r , c-1, toFill , prevFill);
//		floodFill(a , r+1, c, toFill , prevFill);
//		floodFill(a , r, c+1, toFill , prevFill);
//	}
//	static void printMatrix() {
//		System.out.println();
	}


