package arrays;

public class StockBuyAndSell2 {
	
	public static int MaxProfit(int [] a) {
		int profit = 0;
		for(int i = 1 ;i < a.length; i++  ) {
			if(a[i] > a[i-1]) {
				profit += (a[i] - a[i-1]);
			}	
		}
		return profit;
	}
	
	
	public static int helper(int arr [],int index, boolean buy) {
		if(index >= arr.length) return 0;
		int profit  ;
		if(buy == false) {
			int take = - arr[index] + helper(arr,index+ 1,true);
			int notTake = helper(arr,index + 1,false);
			profit = Math.max(take, notTake);
		}else {
			int sell = arr[index] + helper(arr,index+ 1,false);
			int notSell = helper(arr,index + 1,true);
			profit = Math.max(sell, notSell);
		}
		return profit;
		
	}
	
	public static void main(String[] args) {	
		int [] a = {1, 2, 3, 4, 5};
		System.out.println(MaxProfit(a));
	}

}
