package adv;

import java.util.*;


public class BlockRoads {
	
	static long gcd (long a , long b) {
		if(b == 0 ) return a;
		return gcd(b, a%b);
	}
	
	static class Node {
		int v;
		int wt;
		Node(){};
		Node(int v , int wt){
			this.v = v;
			this.wt = wt;
		}
	}

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t -- > 0) {
				int n = sc.nextInt();
			    int k = sc.nextInt();
			    int edges [][] = new int[n-1][3];
			    for(int i = 0 ; i < n - 1; i++) {
			    	edges[i][0] = sc.nextInt();
			    	edges[i][1] = sc.nextInt();
			    	edges[i][2] = sc.nextInt();
			    }
			    
			    ArrayList<ArrayList<Node>> adj = new ArrayList<>();
			    for(int i = 0 ; i <= n ; i++) {
			    	adj.add(new ArrayList<Node>());
			    }
			    for(int i = 0 ;i < edges.length ; i++) {
			    	int u = edges[i][0];
			    	int v = edges[i][1];
			    	int wt = edges[i][2];
			    	adj.get(u).add(new Node(v,wt));
			    	adj.get(v).add(new Node(u,wt));
			    }
			    int size [] = new int[n + 1];
			    dfs(1,0,size,adj);
			    ArrayList<Integer> unInf = new ArrayList<>();
			    countUnInf(1,0,size,adj,unInf);
			    Collections.sort(unInf,(a,b) -> a - b);
			    int inf = n;
			    int ans = 0;
			    while(inf > k && unInf.size() > 0) {
			    	inf -= unInf.remove(unInf.size() - 1);
			    	ans ++;
			    }
			    if(inf > k) System.out.println(-1);
			    else System.out.println(ans);
			}
		
		} catch(Exception e) {
			return ;
		}
		
		
	}

	private static void countUnInf(int node, int parent, int[] size, ArrayList<ArrayList<Node>> adj,ArrayList<Integer> list ) {
		for(Node it : adj.get(node)) {
			if(it.v == parent) continue;
			if(it.wt == 1) {
				list.add(size[it.v]);
				continue;
			}
			countUnInf(it.v,node,size,adj,list);
		}
		
	}

	private static int dfs(int node, int parent, int[] size,ArrayList<ArrayList<Node>> adj) {
		 size[node] = 1;
		for(Node it : adj.get(node)) {
			if(it.v == parent) continue;
			size[node] += dfs(it.v,node,size,adj);
		}
		return size[node];
		
	}



	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}


}

