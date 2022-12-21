package cp;

import java.util.*;


public class Div4 {
	
	

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> dp [][];
		int grid [][];
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t -- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			 grid  = new int[n][m];
			for(int i = 0 ; i < n; i++) {
				for(int j = 0 ; j < m ; j++) {
					grid[i][j] = sc.nextInt();
				}
			}
			 dp = new HashMap[n][m];
			 for(int i = 0 ; i < n; i++) {
					for(int j = 0 ; j < m ; j++) {
						dp[i][j] = new HashMap<>();
					}
				}
			int a =  helper(grid,0,0,0,dp);
			if(a == 0) System.out.println("NO");
			else System.out.println("YES");
			
		}

	}

	private static int helper(int[][] grid, int i, int j, int sum,HashMap<Integer,Integer> dp [][]) {
		
		if(i == grid.length -1 && j == grid[0].length -1) {
			if(sum + grid[i][j] == 0) return 1;
			return 0;
		}
		
		if(i >= grid.length || j >= grid[0].length) return 0;
		if(dp[i][j].containsKey(sum)) return dp[i][j].get(sum);
		
		if(helper(grid,i+1,j,sum + grid[i][j],dp) == 1) {
			dp[i][j].put(sum, 1);
			return 1;
		}
		else if(helper(grid,i,j+1,sum + grid[i][j],dp) == 1) {
			dp[i][j].put(sum, 1);
			return 1;
		}
		else {
			dp[i][j].put(sum, 0);
			return 0;
		}
		
	}

	


	

}
