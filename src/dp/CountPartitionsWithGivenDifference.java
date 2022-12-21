package dp;

public class CountPartitionsWithGivenDifference {
	
	public static int countPartions(int arr [] , int d) {
		int total = 0;
		for(int val :arr) total += val;
		if(total - d < 0 || (total - d) % 2 == 1 ) return 0;
		return findWays(arr,(total- d ) / 2);
	}
	
public static int helper1(int index , int arr [] , int sum) {
		
		if(index == 0) {
			if(sum == 0 && arr[0] == 0) return 2;
			 if(sum == 0 || sum == arr[0]) return 1;
			 return 0;
		}
		
		int np = helper1(index - 1, arr, sum);
		int p = 0;
		if(arr[index] <= sum) p = helper1(index - 1, arr,sum - arr[index]);
		return p + np;
	}

	private static int findWays(int[] arr, int target) {
		int n = arr.length;
		return helper1(n-1,arr,target);
	}

	public static void main(String[] args) {

		
	}

}
