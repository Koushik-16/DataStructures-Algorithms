package graph;

public class MaximumWeightNode {
	
	public static int maxWeight(int n , int edges []) {
		if( n == 1) return 0;
		int ans [] = new int[n];
		for(int i = 0 ; i < edges.length ; i++) {
			if(edges[i] == -1) continue;
			ans[edges[i]] += i;
		}
		
		int max = 0;
		for(int val : ans) max = Math.max(val, max);
		return max;
		
	}

	public static void main(String[] args) {
		int n = 4;
		int arr [] = {2,0,-1,2};
         System.out.println((maxWeight(n,arr)));
	}

}
