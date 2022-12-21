package recursion;

public class SumofArrayElements {
	
	public static int SumOfArray(int [] a , int n) {
		if(n == 0) {
			return 0;
		}
		return a[n-1]+SumOfArray( a, n-1);
	}

	public static void main(String[] args) {
		
		int [] a= {8, 2, 3, 4, 5, 6, 7};
		int n = a.length;
		System.out.println(SumOfArray(a, n));

	}

}
