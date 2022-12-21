package queue;

import java.util.PriorityQueue;

public class NearlySorted {
	
	public static void sort(int [] a, int k) 	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0 ; i <= k; i++) {
			pq.add(a[i]);
		}
		for(int i = k+1; i < a.length; i++) {
			System.out.println(pq.remove());
			pq.add(a[i]);
		}
		while(pq.size() > 0) {
			System.out.println(pq.remove());
		}
	}
			

	public static void main(String[] args) {
		int a [] = {2,3,1,4 , 6,7, 5, 8, 9 };
          sort(a,2);
	}

}
