package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfIslands2 {
	
	public static List<Integer> islands(int m , int n , int positions[][]){
		List<Integer> ans = new ArrayList<>();
		int par [] = new int[n*m];
		int rank [] = new int[n*m];
		Arrays.fill(par, -1);
		int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
		int count = 0;
		for(int i = 0 ; i < positions.length ; i++) {
			int row = positions[i][0];
			int col = positions[i][1];
			
			int cellno = row * m + col;
			
			if(par[cellno] !=-1) {
				ans.add(count);
				continue;
			}
			par[cellno] = cellno;
			rank[cellno] = 1;
			count++;
			for(int j = 0; j < dir.length ; j++) {
				int rowdash = row + dir[j][0];
				int coldash = col + dir[j][1];
				int celldash = rowdash * m + coldash;
				if(rowdash  < 0 || rowdash >= n || coldash < 0 || coldash >= m || par[celldash] == -1) continue;
				
				int lx = find(cellno,par);
				int ly = find(celldash,par);
				if(lx != ly) {
					if(rank[lx] > rank[ly]) {
						par[ly] = lx;
					}else if(rank[lx] < rank[ly]) {
						par[lx] = ly;
					} else {
						par[ly] = lx;
						rank[lx]++;
					}
					count--;
				}
			}
			ans.add(count);
			
		}
		return ans;
		
	}
	
	public static int find(int x , int par[]) {
		if(par[x] == x) return  x;
		return par[x] = find(par[x],par);
	}

	public static void main(String[] args) {
		

	}

}
