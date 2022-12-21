package recursion;

public class Josephusproblem {
	public static int jos(int n , int k) {
		if(n == 1 ) return 0;
		return (jos(n -1, k) + k) % n;
	}
	public static void main(String[] args) {
		int ans = jos(5,7);
		System.out.println(ans);
		
		
	}

}
