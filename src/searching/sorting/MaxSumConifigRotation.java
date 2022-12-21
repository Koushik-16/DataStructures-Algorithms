package searching.sorting;

public class MaxSumConifigRotation {
	
	public static int MaxSum(int [] a, int n) {
		int sum = 0;
		int s0 =0;
		for(int i = 0; i < n; i++ )	{
			sum += a[i];
			s0 += a[i]*i;
		}
		int max = s0 ;
		int si = s0;
		for(int i = 0; i < n; i++) {
			int sip1 = si + sum -(n*a[n-i-1]);
			if(sip1 > max ) {
				max = sip1;
			}
			si = sip1;
		}
		return max;
		
	}
	public static void main(String[] args) {
		int a []  = {8,3,1,2};
		System.out.println(MaxSum(a,a.length));

	}

}
