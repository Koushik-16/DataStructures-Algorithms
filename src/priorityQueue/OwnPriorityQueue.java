package priorityQueue;

import java.util.ArrayList;

public class OwnPriorityQueue {
	
	
	public static class PriorityQueue{
		
		ArrayList<Integer> data;
		
		public PriorityQueue() {
			data = new ArrayList<>();
		}
		
		public void add(int val) {
			data.add(val);
			upHeapify(data.size() - 1);
		}
		
		private  void upHeapify(int i) {
			if(i == 0 ) return ;
			int parentIndex = (i - 1)/ 2;
			if(data.get(parentIndex) > data.get(i)) {
				swap(i, parentIndex);
				upHeapify(parentIndex);
			}
			
		}

		private void swap(int i, int j) {
			int ith = data.get(i);
			int jth = data.get(j);
		   data.set(i, jth);
		   data.set(j, ith);
			
		}

		public int remove() {
			if(this.size() == 0) {
				System.out.println("Underflow");
				return - 1;
			} 
			swap(0, data.size() - 1);
			int val = data.remove(data.size() - 1);
		   downHeapify(0);
			return val;
			
		}
		
		private void downHeapify(int pi) {
			
		int min = pi;
		int li = 2 * pi + 1;
		if(li < data.size() && data.get(li) < data.get(min)) {
			min = li;
		}
		
		int ri = 2 * pi + 2;
		if(ri < data.size() && data.get(ri) < data.get(min)) {
			min = ri;
		}
		if(min != pi) {
			swap(min , pi);
			downHeapify(min);
		}
			
		}

		public int peek() {
			if(this.size() == 0) {
				System.out.println("Underflow");
				return - 1;
			}else {
				return data.get(0);
			}
		}
		
		public int size() {
			return data.size();
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		PriorityQueue pq = new PriorityQueue();
         pq.add(10);
         pq.add(1);
         pq.add(2);
         pq.add(4);
         System.out.println(pq.remove());
         System.out.println(pq.peek());
	}

}
