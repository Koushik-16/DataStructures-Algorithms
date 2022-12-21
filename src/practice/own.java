package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class own {

	public static int [] MergeSort(int [] a, int low , int high) {
		if(low == high) {
			int [] ba = new int[low];
			return ba;
		}
		int mid = (low + high) / 2;
		MergeSort(a,low,mid);
		MergeSort(a,mid +1, high);
		return Merge(a,low , mid, high);
	}
	
	private static int [] Merge(int[] nums, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid +1;
		while(left<= mid && right <= high) {
			if(nums[left] <= nums[right]) {
				temp.add(nums[left++]);
			}
			else {
				temp.add(nums[right++]);
			}
		}
		
		while(left <= mid) {
			temp.add(nums[left++]);
		}
		
		while(right <= high) {
			temp.add(nums[right++]);
		}
		
		for(int i = low ; i<= high ; i++) {
			nums[i] = temp.get(i-low);
		}
		return nums;
		
	}

	public static void main(String[] args) {
		int a [] = {2, 5, 1, 3, 9 , 7 , 11, 5};
int ans [] = MergeSort(a,0,a.length - 1);
System.out.println(Arrays.toString(ans));
	}

}
