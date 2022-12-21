package practice;

import java.util.PriorityQueue;

public class ConnectNropes {
	
	public static int ConnectNropes(int a []) {
		int cost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < a.length ; i++) {
			pq.add(i);
		}
		while(pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();
			int sum = first + second;
			cost += sum;
			pq.add(sum);
		}
		return cost;
	}

	public static void main(String[] args) {
		

	}

}
