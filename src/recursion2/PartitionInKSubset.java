package recursion2;

public class PartitionInKSubset {
	
	public static boolean canPartitionKSubsets(int[] nums, int k) {
        if(nums.length < k) return false;
         int sum = 0;
        for(int val : nums) sum += val;
        if(sum % k != 0) return false;
        boolean vis [] = new boolean[nums.length];
        int subsetSum = sum /k;
        return canPartition(nums,vis,0,k,0,subsetSum);
    }
	
	
    public static boolean canPartition(int nums [] , boolean vis [], int ind, int k, int currSum , int subsetSum){
    if( k == 0) return true;
    if(currSum > subsetSum) return false;
    if(currSum == subsetSum){
        return canPartition(nums,vis,0,k-1,0,subsetSum);
    }
    for(int i = ind ; i < nums.length ; i++){
        if(vis[i]== true) continue;
            vis[i] = true;
            if(canPartition(nums,vis,i + 1,k,currSum + nums[i],subsetSum)) return true;
            vis[i] = false;
        
    }
    return false;
       
   }
	
	

	public static void main(String[] args) {
		
	}

}
