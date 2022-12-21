package searching.sorting;

public class BookAllocation {
	
	static int MaxOf(int a [] ) {
		int max = a[0];
		for(int i = 1 ; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}
		return max;
	}
	static int SumOf(int [] a) {
		int sum = 0;
		for(int i = 0 ; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static int Allocate(int [] a , int k) {
		int min = MaxOf(a);
		int max = SumOf(a);
		int res = 0; 
		while(min <= max) {
			int mid = (min + max) / 2;
			if(isFeasible(a,k,mid)) {
				res = mid;
				max = mid-1;
			} else {
				min = mid+1;
			}
		}
		return res;
	}
	
	static boolean isFeasible(int [] a , int k , int mid) {
		int student = 1;
		int sum = 0 ; 
		for(int i  = 0 ; i < a.length ; i++) {
			if(sum + a[i] > mid) {
				student ++;
				sum = a[i];
			} else {
				sum += a[i];
			}
		}
		return student <= k;
	}

	public static void main(String[] args) {
		int k  = 2;
		int [] a = {10, 10 , 20 , 30};
		System.out.println(Allocate(a,k));
	}
}
