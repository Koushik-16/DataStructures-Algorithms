package searching.sorting;

public class NextPermutation {
	
	public class Solution {
	    public static int[] nextPermutation(int[] A) {
	        if(A == null || A.length <= 1) return A;
	        int i = A.length - 2;
	        while( i >= 0 && A[i] >= A[i + 1]){
	             i --;
	        }
	        if(i >= 0){
	            int j = A.length - 1;
	            while(A[j] <= A[i]) j --;
	            swap(A , i , j);
	        }
	       return  reverse(A,i+1,A.length - 1);
	    }
	    public static void swap(int [] A, int i , int j ){
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }
	    public static int [] reverse(int A [] , int i , int j){
	        while(i < j) swap(A,i++, j--);
	        return A;
	    }

	}
	public static void main(String[] args) {
		

	}

}
