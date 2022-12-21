package recursion2;

public class CoinChange {//dp
	
	 public static int coinChange(int[] coins, int amount) {
		 if(amount == 0) return 0;
		 int a = countCoins(coins,0,amount);
		 if(a != 100000) return a;
		 else return -1;
		 
	 }

	private static int countCoins(int[] a, int i, int target) {
		if(target == 0) return 0;
		if(i >= a.length) return 100000;
		if(target < 0) return 100000;
	    
		return Math.min(1 + countCoins(a,i,target - a[i]), countCoins(a,i+ 1,target));
		
		
	}

	public static void main(String[] args) {
		int a [] = {1,2,5};
       System.out.println(coinChange(a,11));
	}

}
