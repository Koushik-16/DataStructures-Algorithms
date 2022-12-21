package dp;

public class CherryPickup2 {
	
	public static int maxCherry(int grid [][]) {
		return helper(grid,0,0,grid[0].length -1);
	}

	private static int helper(int[][] grid, int i, int j1, int j2) {
		if(i == grid.length - 1) {
			if(j1 == j2) return grid[i][j1];
			else return grid[i][j1] + grid[i][j2];
		}
		int max = 0;
		for(int d1 = -1 ; d1 <= 1; d1++) {
			for(int d2 = -1 ; d2 <= 1; d2 ++) {
				if(j1 == j2) max =  Math.max(max,grid[i][j1] + helper(grid,i+ 1,j1 + d1,j2 + d2));
				else max =  Math.max(max,grid[i][j1] + grid[i][j2] + helper(grid,i+ 1,j1 + d1, j2 + d2));
			}
		}
        return max;		
	}

	public static void main(String[] args) {
		
	}

}
