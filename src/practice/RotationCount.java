package practice;

public class RotationCount {
	
	public static int RotationCount(int a []) {
		int low = 0;
		int high = a.length - 1;
		if(a[low] < a[high]) return 0;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(mid < high && a[mid] > a[mid + 1]) return mid + 1;
			else if (mid > low && a[mid] < a[mid - 1]) return mid;
			else if (a[mid] >= a[low]) low = mid + 1;
			else if (a[mid] <= a[high]) high = mid - 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		
               int a[] = {3,1};
               System.out.println(RotationCount(a));
	}

}
