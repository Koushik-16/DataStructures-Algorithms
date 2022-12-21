package priorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KClosestPoint {
	
	public static int [][] kClosest(int [][] points , int k ){
		PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> distance(b) - distance(a));
		for(int i = 0 ; i < points.length ; i++) {
			if(i < k) {
				pq.add(points[i]);
			}else {
				if(distance(points[i]) < distance(pq.peek())) {
					pq.remove();
					pq.add(points[i]);
				}
			}
		}
		int a [][] = new int[k][2];
		for(int i = 0 ; i < k ; i++ ) {
			a[i] = pq.remove();
		}
		return a;
	}

	public static int distance(int a []) {
		int x = a[0] * a[0];
		int y = a[1] * a[1];
		return x + y;
	}
	
	public static void main(String[] args) {
//		int b [][] = {{-5,4},{-6,-5},{4,6}};
//		int a [][] = kClosest(b,2);
//		
//		for(int i =0 ; i < a.length; i++) {
//			for(int j = 0 ; j < a[0].length ;j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		ArrayList<Integer> a = new ArrayList<>();
		pq.addAll(a);

	}

}
