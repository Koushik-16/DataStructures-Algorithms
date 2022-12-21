package recursion;

public class JumpGame {
	
	public static int jump(int a []) {
		Integer dp [] = new Integer[a.length];
		return helper(a,0,dp);
		
	}
	
	public static int helper(int a [], int index,Integer dp []) {
		if(index >= a.length -1) return 0;
		 if(dp[index] != null) return dp[index];
	        int min = 10000;
		for(int i = index + 1 ; i<= index + a[index] ; i++) {
			min = Math.min(min, 1 + helper(a,i,dp));
		}
		return dp[index] = min;
	}

	public static void main(String[] args) {
	          int a [] = {2,3,1,1,4};
	          System.out.println(jump(a));
	          
	}

}
