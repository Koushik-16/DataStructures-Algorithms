package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwapsToMakeArraySorted {
	
	
	static  class Pair {
        int val ;
        int ind;
        Pair(int val, int ind){
            this.val = val;
            this.ind = ind;
        }
    }
   
    public static int minSwaps(int nums[]){
        int n = nums.length;
       Pair p [] = new Pair[n];
       for(int i = 0 ; i < n ; i++) p[i] = new Pair(nums[i],i);
       Arrays.sort(p,(a,b) -> a.val - b.val);
       int i = 0;
       boolean vis[] = new boolean[n];
       int count = 0;
       while(i < n){
           if(vis[i] == true) {
               i++;
               continue;
           }else if(p[i].ind == i){
               count++;
               i++;
               continue;
           }else {
               int j = i;
               while(vis[j] == false){
                   vis[j] = true;
                   j = p[j].ind;
               }
               count++;
           }
           
       }
       return n - count;
    }
	

	public static void main(String[] args) {
		

	}

}
