package searching.sorting;

import java.util.ArrayList;

public class ReversePairs {// correct

	 public static int reversePairs(int[] nums) {
	        return inversion(nums,0,nums.length - 1);
	    }
	    public static int inversion(int a [], int l , int h){
	        if(l >= h) return 0;
	        int mid = (l + h) / 2;
	        int inv = inversion(a,l,mid);
	        inv += inversion(a,mid + 1,h);
	        inv += merge(a,l,mid,h);
	        return inv;
	    }
	    
	    public static int merge(int a[] , int l ,int m , int h ){
	        int count = 0;
	        int j = m + 1;
	        for(int i = l ; i <= m ; i++){
	           
	        while(j <= h && (long)a[i]  > (long)a[j] * 2){
	           j++;
	        }
	            count += (j - (m + 1));
	        }
	    ArrayList<Integer> temp = new ArrayList<>();
	    int left = l;
	    int right = m + 1;
	    while(left <= m && right <= h){
	        if(a[left] > a[right]){
	            temp.add(a[right++]);
	        }else {
	            temp.add(a[left++]);
	        }
	    }
	    while(left <= m){
	        temp.add(a[left++]);
	    }
	    while(right <= h){
	        temp.add(a[right++]);
	    }
	    for(int i = l ; i <= h ; i++){
	       a[i] = temp.get(i - l);
	    }
	    return count;
	}

	public static void main(String[] args) {
		int a [] = {40, 25 , 19, 12 , 9,  6, 2};
		
		int ans = reversePairs(a);
		System.out.println(ans);

		

	}
}