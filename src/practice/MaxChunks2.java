package practice;

public class MaxChunks2 {
	
	public int maxChunks(int arr []) {
		int n = arr.length;
		int rightmin [] = new int[n + 1];
	    rightmin[n] = Integer.MAX_VALUE;
	    for(int i = n - 1;i  >= 0; i--) rightmin[i] = Math.min(arr[i],rightmin[i+ 1]);
	    int leftmax = Integer.MIN_VALUE;
	    int count = 0;
	    for(int i = 0; i < n ; i++) {
	    	leftmax = Math.max(leftmax, arr[i]);
	    	if(leftmax <= rightmin[i +1]) count++;	
	    }
	    
	    return count;
	}
	

	public static void main(String[] args) {
	long x = (long) 1e13;

	}

}
