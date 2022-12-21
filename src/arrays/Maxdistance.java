package arrays;

public class Maxdistance {
	
	public static int solution(int [] a) {
		int n = a.length;
		int [] left = new int [n];
		int [] right = new int [n];
		left[0] = a[0];
		right[n-1] = a[n-1];
		for(int i = 1; i<n; i++) {
			left [i] = Math.min(left[i-1],a[i] );
		}
		for(int i = n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], a[i]);
		}
		int ans = 0;
		int x = 0 ;
		int y = 0;
		while(x < n && y < n) {
			if(right[y] >= left[x]) {
				ans = Math.max(ans, y-x);
				y++;
			} else x++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int [] a = {2, 7, 13, 4, 1, 3, 10, 8, 11}; 
		System.out.println(solution(a));

	}

}
