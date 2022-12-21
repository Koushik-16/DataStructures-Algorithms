package practice;

public class SingleNumber {
	
	public static int singleNonDuplicate(int[] nums) {
		
        int low = 0, high = nums.length - 2; 
        while(low <= high) {
            int mid = (low + high) >> 1; 
            if(nums[mid] == nums[mid^1]) {
                low = mid + 1; 
            } 
            else {
                high = mid - 1; 
            }
        }
        return nums[low]; 
    }

	public static void main(String[] args) {
		int a [] = {1 ,1, 2 , 3 , 3 , 4 , 4 , 5 ,5};
		int ans = singleNonDuplicate(a);
          System.out.println(ans);
	}

}
