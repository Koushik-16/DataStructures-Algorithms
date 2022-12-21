package searching.sorting;

public class FirstMissingPositive {
	public  static int firstMissingPositive(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
           if(nums[i] > 0  && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            } else {
               i++;
            }
         }
        for(int k = 0 ; k < nums.length ; k++){
            if(nums[k] != k+1){
                return k+1;
            }
        }
        return nums.length + 1;
    }
    public static void swap(int nums [] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

	public static void main(String[] args) {
		int a [] = {};
System.out.println(firstMissingPositive(a));
	}

}
