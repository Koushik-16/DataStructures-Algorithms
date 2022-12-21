package questions;
import java.util.*;

 public class B {
	
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[nums.length -1];
        for(int i = 0 ;i  < nums.length ; i++){
            int start = i+ 1;
            int end = nums.length - 1;
            while(start < end ){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum > target) end --;
                else start ++;
                if(Math.abs(target - sum) < Math.abs(target - closest)) closest = sum;
            }
        }
        return closest;
    }

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println(a + b);
		System.out.println(a + " " + b);

	}

}
 
// class B {
//	 
//	 public static void main(String[] args) {
//			System.out.println("A");
//
//		}
//	 
// }



 