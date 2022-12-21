package dp;

public class ZeroOneKnapsac {
	
	
	public static int f(int index , int weight [] , int value[], int maxWeight,Integer dp [][]){
        if(index == 0) {
            if(weight[index] <= maxWeight) return value[index];
            else return 0;
        }
        if(dp[index][maxWeight] !=  null) return dp[index][maxWeight];
        int notTake = f(index - 1, weight,value,maxWeight,dp);
        int take = Integer.MIN_VALUE;
        if(weight[index] <= maxWeight) take = value[index] + f(index - 1,weight,value,maxWeight - weight[index],dp);
        
       return dp[index][maxWeight] =  Math.max(take,notTake) ;
    }
    
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        Integer dp[][] = new Integer [n][maxWeight + 1];
        return f(n-1,weight,value,maxWeight,dp);
    }
    
    //tabulation
    static int knapsack1(int[] weight, int[] value, int n, int maxWeight) {
        int dp[][] = new int [n][maxWeight + 1];
        for(int W = weight[0]; W <= maxWeight ;W ++) dp[0][W] = value[0];
        
        for(int ind = 1 ; ind < n ; ind++){
            for(int W = 0 ; W <= maxWeight ; W++){
                int notTake = dp[ind - 1][W];
        int take = Integer.MIN_VALUE;
        if(weight[ind] <= W) take = value[ind] + dp[ind - 1][W - weight[ind]];
        
          dp[ind][W] =  Math.max(take,notTake) ;
            }
        }  
        
        return dp[n-1][maxWeight];
    }
    
    static int knapsack2(int[] weight, int[] value, int n, int maxWeight) {
        int prev [] = new int[maxWeight + 1];
   
        for(int W = weight[0]; W <= maxWeight ;W ++) prev[W] = value[0];
        
        for(int ind = 1 ; ind < n ; ind++){
           for(int W = maxWeight ; W >= 0 ; W--){
                int notTake = prev[W];
                int take = Integer.MIN_VALUE;
               if(weight[ind] <= W) take = value[ind] + prev[W - weight[ind]];
        
              prev[W] =  Math.max(take,notTake) ;
               
            }
        }  
        return prev[maxWeight];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
