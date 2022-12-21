package adv;

import java.util.ArrayList;

public class BinaryLifting {
	static int up[][] = new int[200001][30];
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	
	public void binaryLifting(int node , int parent) {
		up[node][0] = parent;
		for(int i = 1; i <= 30 ; i++) {
			if(up[node][i] != -1) up[node][i] = up[up[node][i-1]][i-1];
			else up[node][i] = -1;
		}
		for(int child : adj.get(node)) {
			if(child != parent)  binaryLifting(child,node);
		}
	}
	
	public int query(int node , int k) {
		if(node == -1 || k == 0) return node;
		for(int i = 30 ; i >= 0 ; i--) {
			if(k >= (1<<i)) {
				return query(up[node][i],k - (1<<i));
			}
		}
	return -1;
	}

	public static void main(String[] args) {
		

	}

}
