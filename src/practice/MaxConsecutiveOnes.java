package practice;

public class MaxConsecutiveOnes {
	
	public static int count(int nums[]) {
		int count  = 0 ;
		int max = 0 ;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] == 1) {
				count += 1;
			} else {
				count = 0;
			}
			max = Math.max(max, count);
		}
		
		return max;
		
	}
	
	public static int maxOnes(int a [], int k ) {
		int ans = 0;
		int j = -1;
		int count = 0;
		for(int i = 0 ;i < a.length ;i++) {
			if(a[i] == 0) {
				count ++;
			}
			while(count > k) {
				j++;
				if(a[j] == 0) {
					count--;
				}
			}
			int len = i -j;
			ans = Math.max(ans, len);
		}
		return ans;
	}

	public static void main(String[] args) {
		

	}

}
