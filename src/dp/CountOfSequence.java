package dp;

public class CountOfSequence {
	
	
	public static int count(int arr [] , int seq []) {
		return helper(0,0,arr,seq);
	}

	private static int helper(int i, int j, int[] arr, int[] seq) {
		if(i >= arr.length && j < seq.length) return 0;
		if(j == seq.length) return 1;
		int count = 0;
		for(int ind = i+1 ; ind < arr.length ; ind++) {
			if(arr[ind] == seq[j]) count += helper(ind,j+1,arr,seq);
		}
		return count;
	}

	public static void main(String[] args) {
		int a [] = { 3, 4, 4, 6, 7, 8 , 2, 6, 9, 2};
		int b [] = {4,6,2};
		System.out.println(count(a,b));

	}

}
