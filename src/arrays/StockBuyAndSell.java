package arrays;

public class StockBuyAndSell {
	public static int maxProfit(int [] a) {
		int minSoFar = a[0];
		int maximumProfit = 0;
		for(int i = 1; i < a.length; i++) {
			if(a[i] < minSoFar) minSoFar =a[i];
			maximumProfit = Math.max(maximumProfit,a[i]-minSoFar);
		}
		return maximumProfit;
	}
	public static void main(String[] args) {
		 int a [] = {3, 1, 4, 9, 7, 2, 5};
		 System.out.println(maxProfit(a));

	}

}
