package arrays;

public class FacebookQuestion {
	
	static int[] sortedSquaredArray (int [] Array) {
		int[] result = new int [Array.length];
		int left = 0;
		int right = Array.length -1;
		for(int i = Array.length-1; i >= 0; i--) {
			if(Math.abs(Array[left]) > Array[right]) {
				result[i] = Array[left] * Array[left];
			left++;
		} else {
			result[i] = Array[right] * Array[right];
			right--;
		}
		
	}
		return result;
	}
	public static void main(String[] args) {
		int a [] = {-5, -4, 1, 7 ,8};
		int ans [] = sortedSquaredArray(a);
		for(int x : ans) {
			System.out.print(x + " ,");
		}
	}
}
