package searching.sorting;

public class Ship {
	public static int shipWithinDays(int[] weights, int days) {
        int low = minOf(weights);
        int high = sumOf(weights);
        int ans = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(weights,mid,days)){
            	System.out.println(mid);
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public static boolean isPossible(int a [], int m , int days){
        int currday = 1;
        int sum = 0;
        for(int i  = 0 ; i < a.length ; i++){
        	if(a[i] > m) return false;
            if((sum + a[i]) > m){
                currday++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }
        return currday <= days;
    }
    
    public static  int minOf(int a []){
        int min  = Integer.MAX_VALUE;
        for(int val : a) min = Math.min(val , min);
        System.out.println(min);
        return min;
    }
    public  static int sumOf(int a []){
        int ans = 0;
        for(int val : a) ans += val;
        System.out.println(ans);
        return ans;
    }

	public static void main(String[] args) {
		int a [] = {1, 2, 3, 1, 1};
		System.out.println(shipWithinDays(a,4));
	}

}
