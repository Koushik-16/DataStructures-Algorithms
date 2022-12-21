package arrays;

public class ProductExceptSelf {
	
	public static int [] productExceptSelf (int [] nums) {
		int n  = nums.length;
		int [] output_array = new int [n];
		output_array [0] = 1;
		for(int i = 1; i <n; i++) {
			output_array [i] = nums[i-1] * output_array[i-1];
		}
		int  R = 1;
		for(int i = n-1; i>=0 ; i--) {
			output_array [i] = output_array [i] * R;
			R = R *nums[i];
 		}
		return output_array;
    }
	
	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4};
		
		productExceptSelf(arr);		
	}

}
