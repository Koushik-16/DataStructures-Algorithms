package arrays;

public class LongestSubarrayBySum {
	
	int [] findLongestSubarrayBySum (int s, int[] arr) {
		int[] result = new int [] {-1};
		
		int sum = 0;
		int left = 0;
		int right = 0;
		while(right < arr.length) {
			sum += arr[right];
			while(left< right && sum > s) {
				sum -= arr[left--];
			}
if(sum == s &&(result.length ==1 || result[1] - result[0] < right -left)) {
	  result = new int [] {left+1, right +1};
			  
		}
		right ++;
		
	}
    return result;
}
}