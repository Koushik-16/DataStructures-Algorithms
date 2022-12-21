package questions;

public class MaxConsecutiveOnes3 {
	
	public int longestOnes(int[] nums, int k) {
        int j = -1;
        int count = 0;
        int ans  = 0;
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i] == 0) count ++;
            while(count > k ){
                j++;
                if(nums[j] == 0) count --;
            }
            int length = i - j;
            ans = Math.max(ans,length);
        }
        return ans;
    }

	public static void main(String[] args) {
		

	}

}
