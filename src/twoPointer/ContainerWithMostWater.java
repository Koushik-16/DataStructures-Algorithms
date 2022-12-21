package twoPointer;

import java.util.Arrays;

public class ContainerWithMostWater {
	
	public static int solution(int a []) {
		int i = 0 ;
		int j = a.length - 1;
		int maxArea = 0;
		while(i < j) {
			int hight = Math.min(a[i], a[j]);
			int width = j -i;
			int area = hight * width;
			if(a[i] <= a[j]) {
				i++;
			} else {
				j--;
			}
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
	
	 public static  int[] twoSum(int[] a, int target) {
	        int ans [] = new int [2];
	        int i = 0 , j = a.length - 1;
	        while(i < j){
	            if(a[i] + a[j] == target){
	                ans[0] = i;
	                ans[1] = j;
	                return ans;
	            }
	           else if(a[i] + a[j] < target) i++;
	            else j--;
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		int b []= {2, 7, 11, 15}; 
		int a [] = twoSum(b,9);
		System.out.println(Arrays.toString(a));
	}

}
