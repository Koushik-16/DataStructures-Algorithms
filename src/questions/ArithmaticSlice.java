package questions;

public class ArithmaticSlice {
	
	public int numberOfArithmeticSlices(int[] nums) {
        int dp = 0;
        int result = 0;
        for (int i = 2; i < nums.length; i++){
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                dp++;
                result += dp;
            }else dp = 0;
        }
        return result;
    }

	public static void main(String[] args) {
		

	}

}
