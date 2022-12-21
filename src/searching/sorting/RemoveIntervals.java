package searching.sorting;

import java.util.Arrays;

public class RemoveIntervals {
	
	public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);   
        int i = 0;
        int j= 1;
        int ans  = 0;
        while(i < intervals.length && j < intervals.length){
            if(intervals[i][1] <= intervals[j][0]) {
               i = j;
                j++;
            }
            else if(intervals[i][1] <= intervals[j][1]){
                ans ++;
                j++;
            }
            else if(intervals[i][1] > intervals[j][1]){
                ans++;
                i = j;
                j ++;
            }
        }
        return ans ;
    }

	public static void main(String[] args) {
		

	}

}
