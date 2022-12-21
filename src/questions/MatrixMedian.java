package questions;

public class MatrixMedian {
	
	 public static  int findMedian(int[][] A) {
	     int low = 1;
	     int high = 1000000000;
	     int n = A.length;
	     int m = A[0].length;
	     int size = n * m;
	     while(low <= high){
	         int mid = (low + high)/2;
	         int lessCount = count(A,mid);
	         if(lessCount == size - lessCount) return mid;
	         else if(lessCount > size - lessCount) high = mid - 1;
	         else low = mid + 1;
	     }
	     return low;
	    }

	    public static int count(int a [][] , int mid){
	        int count = 0;
	        for(int i =0 ; i < a.length ; i++){
	            count += lastInd(a[i],mid);
	        }
	        return count;
	    }

	    public static int lastInd(int a [], int mid){
	        int low = 0;
	       int  high = a.length - 1;
	       if(mid < a[0]) return 0;
	       else if(mid > a[a.length - 1]) return a.length;
	       while(low <= high) {
	           int m = (low + high)/2;
	           if(a[m] <= mid) low = m + 1;
	           else high = m -1;
	       }
	       return low;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
