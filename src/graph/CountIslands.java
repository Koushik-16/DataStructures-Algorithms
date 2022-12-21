package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountIslands {
	
	public static int numberOfIslands(int [][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		boolean visited [][] = new boolean[n][m];
		int count = 0;
		for(int i =0 ; i <n ; i++ ) {
			for(int j = 0; j < m ; j++) {
				if(arr[i][j] == 0 && visited[i][j] == false) {
					markIsland(arr,i,j,visited);
					count++;
				}
			}
		}
		return count;
	}
	
	private static void markIsland(int[][] arr, int i, int j, boolean[][] visited) {
		if( i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] == 1 || visited[i][j] == true )return;
		
		visited[i][j] = true;
		
		markIsland(arr,i - 1 , j, visited);
		markIsland(arr,i , j + 1, visited);
		markIsland(arr,i + 1 , j, visited);
		markIsland(arr,i , j - 1, visited);
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int arr [][] = new int[n][m];
		for(int i = 0 ;i <n ; i++) {
			String parts = br.readLine();
			for(int j =0 ; j < m ; j++) {
			    arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
			}
		}
		
		System.out.println(numberOfIslands(arr));;

	}

}
