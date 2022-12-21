package practice;

public class NthRoot {
	
	public static double NthRoot(int n , int m) {
		double low = 1;
		double high  = m;
		double eps =1e-6;
		while((high - low ) > eps) {
			double mid = (high + low) /2.0;
			if(multiply(mid , n) < (double)m) {
				low = mid;
			} else {
				high = mid;
			}
		}
		System.out.println(low + "    " + high);
		return low;
	}

	private static double multiply(double mid, int n) {
		double ans = 1.0;
		for(int i = 1 ; i <= n ; i++) {
			ans = ans * mid;
		}
		return ans;
	}

	public static void main(String[] args) {
		int a = 15;
		int b = 4;
		NthRoot(4 ,15);
		

	}

}
