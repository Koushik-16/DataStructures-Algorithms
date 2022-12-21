package arrays;

public class MaximumProduct {

	public static void main(String[] args) {
		
		int a [] = {2 , 8, -3, 6 , 4, 12};
		int n = a.length;
		
		for(int i = 0 ; i<n-1 ; i++) {
			
			boolean sorted = true;
			
			for(int j =0; j<n-1-i; j++) {
				
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] =  temp;
					
					sorted = false;
				}
			}
			if(sorted) break;
       int p = a[n-1]*a[n-2];
       System.out.println(p);
	}

	}
}
