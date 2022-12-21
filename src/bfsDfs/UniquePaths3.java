package bfsDfs;

public class UniquePaths3 {
	
	public static int uniquePathsIII(int[][] grid) {
        int zeros = 0;
        int sx =0;
        int sy = 0;
        for(int i = 0 ; i < grid.length ;i++){
            for(int j =0 ; j < grid[0].length ; j ++){
                if(grid[i][j] == 0) zeros ++;
                else if(grid[i][j] ==1 ){
                     sx = i;
                    sy = j;
                }
            }
        }
        return dfs(grid,sx,sy,zeros);
    }
    
    public static int dfs(int [][] grid, int i , int j , int zeros){
        if(i >= grid.length || j >= grid[0].length || i < 0 || j  < 0 || grid[i][j] == -1)return 0;
       if(grid[i][j] == 2) {
     return zeros == -1? 1 : 0;
       }
        grid[i][j] = -1;
        zeros --;
        int totalpaths = dfs(grid,i + 1,j ,zeros) + dfs(grid,i - 1,j ,zeros) + dfs(grid,i,j + 1 ,zeros) + dfs(grid,i,j -1 ,zeros);
        
        grid[i][j] = 0;
        zeros++;
        return totalpaths;
    }

	public static void main(String[] args) {
	

	}

}
