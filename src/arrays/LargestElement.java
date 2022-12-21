package arrays;

public class LargestElement {

	public static void main(String[] args) {
		
		int a [] = {2 ,12, 8, -3, 6,  4, };
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
		}
		System.out.println(a[0]);
			System.out.print(a[n-1]);
		}
		

	}


