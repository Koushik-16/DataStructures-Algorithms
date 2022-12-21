package searching.sorting;

public class Banana {
	static int maxOf(int a [] ) {
		int max = a[0];
		for(int i = 1 ; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}
		return max;
	}
	
	public static boolean isPossible(int [] a , int mid , int h) {
		int time = 0;
		for(int i = 0 ; i < a.length; i ++) {
			time += (int)Math.ceil(a[i]*1.0/mid);
		}
		return time<= h;
	}
	
	public static int Speed(int [] a , int h) {
		int speed = Integer.MAX_VALUE;
		int high = maxOf(a);
		int low = 0;
		if(h == a.length) return high;
		while(low <= high ) {
			int mid = (low + high)/2;
			if(isPossible(a,mid,h)) {
				speed = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return speed;
	}

	public static void main(String[] args) {
		int [] a = {3, 6, 7, 11};
		System.out.println(Speed(a,8));

	}

}
