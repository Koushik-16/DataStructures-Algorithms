package test;

public class Max {
	
	public static  int maxOf(int arr [] ,int low , int high) {
		if(low == high) return arr[low];
		else {
			int mid = (low + high) /2;
			int a = maxOf(arr,low,mid);
			int b = maxOf(arr,mid + 1,high);
			return Math.max(a, b);
		
		}
	}

	public static void main(String[] args) {
		int a [] = {3,5,1,9,6,0,7};
		
        System.out.println(maxOf(a,0,a.length-1));
	}

}
