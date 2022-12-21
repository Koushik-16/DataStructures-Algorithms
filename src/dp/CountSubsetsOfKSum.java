package dp;


public class CountSubsetsOfKSum {
	
	public static int count(int arr [], int sum) {
		return helper(arr.length - 1,arr,sum);
	}
	
	public static int helper(int index , int arr [] , int sum) {
		if(sum == 0) return 1;
		if(index == 0) if(arr[index] == sum) return 1;
		
		int np = helper(index + 1, arr, sum);
		int p = 0;
		if(arr[index] <= sum) p = helper(index + 1, arr,sum - arr[index]);
		return p + np;
	}
	
	public static int helper1(int index , int arr [] , int sum) {
		
		if(index == 0) {
			if(sum == 0 && arr[0] == 0) return 2;
			 if(sum == 0 || sum == arr[0]) return 1;
			 return 0;
		}
		
		int np = helper1(index + 1, arr, sum);
		int p = 0;
		if(arr[index] <= sum) p = helper1(index + 1, arr,sum - arr[index]);
		return p + np;
	}

	public static void main(String[] args) {
		
	}

}
