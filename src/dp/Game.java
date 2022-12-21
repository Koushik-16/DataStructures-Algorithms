package dp;

public class Game {
	
	public static int  PredictTheWinner(int[] nums) {
        Integer dp [][] = new Integer [nums.length][nums.length];
        int p1 =  helper(nums,0,nums.length - 1,dp);
        int sum = 0 ;
        for(int val : nums) sum +=  val;
        int p2 = sum -p1;
        return   p1 - p2;
    }
    public static int  helper(int nums [] , int i , int j,Integer dp [][]){
        if(i == j) return nums[i];
       if(i + 1 == j) return Math.max(nums[i],nums[j]);
        if(dp[i][j] != null) return dp[i][j];
        int f = nums[i] + Math.min( helper(nums,i+ 2,j,dp),helper(nums,i + 1,j - 1,dp));
        int e = nums[j] + Math.min(helper(nums,i + 1,j - 1,dp),helper(nums,i,j - 2,dp));
        return dp[i][j] = Math.max(f,e);
    }

	public static void main(String[] args) {
		int a [] = {4, 2, 9, 7, 1, 5};
		System.out.println(PredictTheWinner(a));

	}

}
