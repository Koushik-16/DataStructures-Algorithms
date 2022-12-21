package searching.sorting;

public class squareroot {
	
	public static int squareroot(int n) {
		int x = 0;
		 for(int i = 1; i * i <= n; i++) {
			 x = x+1;
		 }
		 return x;
	}
	 public int sqrt(int A) {
			long l = 1;
			long r = A ;
			long res = 0;
			while( l <= r) {
			    long mid = l+(r - l) / 2;
			    if(mid * mid < A){
			        l = mid +1;
			        res = mid;
			    }
			    else if (mid * mid  > A) r = mid -1 ;
			    else return (int)mid;
			}
			return (int)res;

	}

	public static void main(String[] args) {
		System.out.println(squareroot(8));
	}

}
