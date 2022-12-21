package practice;

public class NewCountInversion { //correct
	
	static long inversionCount(long arr[], long N) {
	       return merge(arr,0,(int)N-1);
	    }
	    
	    static long merge(long arr[], int low , int high){
	      long count = 0;
	      if(low < high){
	          int mid = low + (high -low) / 2;
	          count += merge(arr,low,mid);
	          count += merge(arr,mid + 1, high);
	          count += mergesort(arr,low,mid,high);
	      }
	      return count;
	    }
	    
	    static long mergesort(long arr[], int low ,int mid, int high){
	        int n1 = (mid - low + 1);
	        int n2 = (high - mid);
	        long left [] = new long[n1];
	        long right [] = new long[n2];
	        for(int i = 0 ;i < n1 ; i++) left[i] = arr[low + i];
	        for(int i = 0 ; i < n2 ;i++) right[i] = arr[mid + i + 1];
	        int i = 0;
	        int j = 0;
	        int k = low;
	        long invcount = 0;
	        while(i < n1 && j < n2){
	            if(left[i] <= right[j]){
	                arr[k++] = left[i++];
	            }else {
	                arr[k++] = right[j++];
	                invcount += left.length - i;
	            }
	        }
	        while(i < n1) arr[k++] = left[i++];
	        while(j < n2) arr[k++] = right[j++];
	        return invcount;   
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
