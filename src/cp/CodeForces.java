package cp;

import java.util.*;

public class CodeForces {
	
	static class Pair {
		int s;
		int i;
		Pair(int s, int i){
			this.s = s;
			this.i = i;
		}
	}
	

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		    while(t -- > 0) {
		    	
		    	
			  }
		    }
	
	
       
       
	


	static int gcd (int a , int b) {
		if(b == 0 ) return a;
		return gcd(b, a%b);
	}
	
	public static int lowerBound(int arr [],int low, int high, int key) {
		while(low <= high) {
			int mid = (low + high) /2;
			 if(arr[mid] >= key) high = mid - 1;
			else low = mid + 1;
		}
		return low;
	}
	
	public static long pow(long x, long n, long d) {
		if(n == 0 ) return 1 % d;
		if(x < 0) return pow(x + d, n , d);
		if(n == 1) return x % d;
		long ans = 1;
		while(n > 0 ){
			if(n % 2 == 0){
				x = x * x % d;
				n = n /2;
			}else {
				ans  = (ans * x) % d;
				n = n -1;
			}
		}
		return ans % d;
	}
	
	

	public static int numSetBits(long a) {
        int counter = 0;
	 while(a != 0) {
		 a = (a&(a-1));
		 counter++;
	 }
	 return counter;
    }

	private static void swap(int[] ans, int i, int j) {
		int temp = ans[i];
		ans[i] = ans[j];
		ans[j] = temp;
		
	}
		

}

	
