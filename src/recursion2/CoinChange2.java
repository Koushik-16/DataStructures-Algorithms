package recursion2;

public class CoinChange2 {
	
	public static int coin2(int a [] , int target) {
		if(target == 0) return 0;
		return helper(a,0,target);
	}

	private static int helper(int[] a, int i, int target) {
		if(i == a.length) {
			if(target == 0) return 1;
			return 0;
		}
		int count = 0;
		if(a[i] <= target) count += helper(a,i,target -a[i]);
		count += helper(a,i+1,target);
		return count;
	}

	public static void main(String[] args) {
		int a [] = {2};
		System.out.println(coin2(a,3));
	}

}
