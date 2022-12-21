package searching.sorting;

public class MissingAndRepeating {
	
	public static int[] findErrorNums(int[] nums) {
        int i = 0 ;
        int res []  = new int [2];
        while(i < nums.length){
          if(nums[nums[i]-1] != nums[i]){
             swap(nums,i,nums[i] -1);
          } else{
              i++;
          }
        }
        for(int k = 0 ; k < nums.length; k++){
            if(nums[k] != k+1){
              res[1] = k+1;
                res[0] = nums[k];
            }
        }
    return res;
    }
    public static void swap(int nums[] , int i , int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

	public static void main(String[] args) {
		int a [] = {1, 2, 2, 4};
		int b [] = findErrorNums(a);
        for(int val : b) {
        	System.out.println(val);
        }
	}

}
