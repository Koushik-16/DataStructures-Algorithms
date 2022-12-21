package recursion2;

public class CombinationSum4 {//dp
	
	public static int count(int a [], int target) {
		return helper(a,target);
		
	}
	
	private static int helper(int[] a, int target) {
		if(target == 0) {
			return 1 ;
		}
		int result =0;
		for(int i =0; i < a.length ;i++ ) {
			if(target >= a[i]) {
			result += helper(a,target-a[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a [] = {1,2,3};
		System.out.println(count(a,4));
	}

}
