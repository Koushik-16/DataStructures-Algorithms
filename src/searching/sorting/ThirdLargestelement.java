package searching.sorting;

public class ThirdLargestelement {
	
	public static int ThirdLargestelement(int a []) {
		int first = a[0];
		int second = Integer.MIN_VALUE;
		int third =  Integer.MIN_VALUE;
		
		for(int i = 1; i < a.length ; i++) {
			if(a[i] > first) {
				third = second ;
				second = first;
				first = a[i];
			}
			else if (a[i] > second) {
				third  = second;
				second = a[i];
			} else if(a[i] > third) {
				third = a[i];
			}
		}
		return third;
	}

	public static void main(String[] args) {
		int  a [] = {1, 14, 20 , 15, 4, 12, 18, 5}; 
		System.out.println(ThirdLargestelement(a));

	}

}
