package practice;

public class SubarraySumGraterthanTarget {
	
	
	public static int length(int [] arr , int target) {
		int j = 0;
		int i = 0 ;
		int sum = 0;
		int n = arr.length;
		int minLength = n + 1;
		while(i < n) {
		while(i < n && sum <= target) {
			sum += arr[i];
			i++;
		}
		while(j < n && sum > target) {
			minLength = Math.min(i - j , minLength);
			sum -= arr[j];
			j ++;
		}
		}
		return minLength;
	}
	
	//grater than or equal to
	 public int minSubArrayLen(int target, int[] arr) {
	      int j = 0;
			int i = 0 ;
			int sum = 0;
			int n = arr.length;
			int minLength = n + 1;
			while(i < n) {
			while(i < n && sum < target) {
				sum += arr[i];
				i++;
			}
			while(j < n && sum >= target) {
				minLength = Math.min(i - j , minLength);
				sum -= arr[j];
				j ++;
			}
			}
	        if(minLength == n + 1) return 0;
			return minLength;
	    }
	
	public static void main(String [] args) {
		int a [] = {1, 2,2, 9, 1,5 ,6};
		int target = 11;
		System.out.println(length(a, target));
	}

}
