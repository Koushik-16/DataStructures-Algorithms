package searching.sorting;

public class NtrailingZeros {
	
	public static boolean Zeros(int p, int n) {
		int ans = 0;
		for(int i = 5; i<= p ; i = i * 5) {
			ans = ans + (p / i);
		}
		if(ans >= n) {
			return true;
		}
		return false;
	}
	
	public static int SmallestNumber(int n) {
		if(n == 1) return 5;
		
		int low = 0; 
		int high = n*5;
		while( low < high) {
			int mid = (low + high ) / 2;
			if(Zeros(mid,n)) {
				high = mid;
			} else  {
				low = mid+1;
			}
		}
		return low;
		
	}
	public static void main(String []args) {
		System.out.println(SmallestNumber(12));
	}
}
