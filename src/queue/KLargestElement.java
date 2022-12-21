package queue;

import java.util.PriorityQueue;

public class KLargestElement {
	
	public static void KLargestElement(int [] a , int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		
		for(int i = 0 ; i < a.length; i++) {
			if(pq.size() == k) {
			if(pq.peek() < a[i]) {
				pq.poll();
				pq.add(a[i]);
			}
			} else {
				pq.add(a[i]);
			}
		}
		while(pq.size() > 0) {
			System.out.println(pq.poll());
		}
	}

	public static void main(String[] args) {
		
		int [] a = {9 ,8 ,12, 1, 4, 7, 3, 2};
		KLargestElement(a,3);
       
	}

}
