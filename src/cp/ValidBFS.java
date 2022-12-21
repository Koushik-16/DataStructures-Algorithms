package cp;

import java.util.*;
public class ValidBFS {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int edges [][] = new int[n-1][2];
			for(int i = 0 ; i < edges.length ; i++) {
				edges[i][0] = sc.nextInt();
				edges[i][1] = sc.nextInt();
			}
			int bfs [] = new int[n];
			for(int i = 0  ; i < n ; i++) bfs[i] = sc.nextInt();
			ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
			for(int i = 0 ; i <= n ; i++) adj.add(new ArrayList<>());
			for(int i = 0; i < edges.length ; i++) {
				adj.get(edges[i][0]).add(edges[i][1]);
				adj.get(edges[i][1]).add(edges[i][0]);
			}
			HashMap<Integer,Integer> map = new HashMap<>();
			Queue<Integer> q = new LinkedList<>();
			q.add(1);
			boolean vis [] = new boolean[n + 1];
			vis[1] = true;
			int level = 0;
			map.put(1, level);
			while(!q.isEmpty()) {
				int size = q.size();
				level++;
				for(int i = 0 ; i < size; i++) {
					int curr = q.poll();
				for(Integer it : adj.get(curr)) {
					if(vis[it] == false) {
						q.add(it);
						vis[it] = true;
						map.put(it, level);
					}
				}
				}
			}
			int levels[] = new int[bfs.length];
			for(int i = 0 ; i < bfs.length ; i++) {
				levels[i] = map.get(bfs[i]);
			}
			boolean ans = true;
			for(int i = 1; i < levels.length - 1; i++) {
				if(levels[i] >= levels[i-1] && levels[i+1] >= levels[i]) {
					
				}else {
				   ans = false;
				}
			}
			System.out.println(Arrays.toString(levels));
			if(ans == false) System.out.println("No");
			else System.out.println("Yes");
			
			
			
			
			

	}

}
