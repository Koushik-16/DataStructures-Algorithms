package greedyAlgorithm;

import java.util.Arrays;

public class ConsecutiveValues {
	
	public static int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        if(coins[0] != 1) return 1;
        int i = 1;
        int n = coins.length;
        int max = coins[0];
        while( i < n){
            if(coins[i] <= max) max += coins[i];
            else if(max < coins[i]) {
                if(coins[i] == max + 1) max += coins[i];
                else return max + 1;
            }
            i++;
        }
        return max + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
