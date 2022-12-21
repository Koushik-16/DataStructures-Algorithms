package arrays;

public class MaximumProductSubarray {
	
	public static int MaximumProduct(int [] a) {
		int max = a[0];
		int min = a[0];
		int res = a[0];
		for(int i  = 0; i < a.length; i++) {
			if(a[i] < 0) {
				int temp = max;
				max = min;
				min  = temp;
			}
			max = Math.max(a[i], max * a[i]);
			min = Math.min(a[i], min*a[i]);
			res = Math.max(max, res);
		}
		return res;
	}

	public static void main(String[] args) {
		int a [] = {2, 3, 0, -8, -9};
       System.out.println(MaximumProduct(a));
	}

}
