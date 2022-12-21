package arrays;

public class SorAnArrayof012 {
	
	
	public static void sort(int a[])	{
		int low = 0 ; 
		int mid = 0;
		int high = a.length-1;
		int temp ;
		while(mid <= high) {
			switch(a[mid]) {
			case 0 : {
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2 : {
				temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
				break;
			}
			}
		}
	}

	public static void main(String[] args) {
		int a [] = {1, 2, 0, 0, 0, 2, 2, 1};
		sort(a);
		for(int val: a) {
			System.out.print(val+ " ,");
		}

	}

}
