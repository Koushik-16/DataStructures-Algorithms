package arrays;

public class MaxProductSubarray {
	
	
	public static int MaxProduct(int [] a) {
		int minval = a[0];
		 int maxval = a[0];
		 int maxproduct = a[0];
		 for(int i = 1; i < a.length; i++) {
			 if(a[i] < 0) {
			int temp = maxval ;
			maxval = minval;
			minval = temp;
			 }
			 maxval = Math.max(a[i], maxval*a[i]);
			 minval = Math.min(a[i], a[i] * minval);
			 maxproduct = Math.max(maxproduct, maxval);
		 }
		return maxproduct;
	}
	public static void main(String[] args) {
		int a [] = {6,0,-10,-3,2};
		System.out.println(MaxProduct(a));

	}

}
