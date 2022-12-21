package practice;

public class MinimizeTheMaximum {
	
	public static int minimizeTheMaximum(int n , int a []) {
		int low = 1;
		int high = maxOf(a);
		int ans = high;
		while(low <= high) {
			int mid = (low + high) /2;
			int count = 0;
			for(int val : a) {
				count += val / mid;
				if(val % mid != 0) count += 1;
			}
			if(count <= n) {
				ans = mid;
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static int maxOf(int[] a) {
		int max = a[0];
	for(int i = 1 ; i< a.length ; i++) {
		max = Math.max(max, a[i]);
	}
	return max;
	}

	public static void main(String[] args) {
		

	}

}
