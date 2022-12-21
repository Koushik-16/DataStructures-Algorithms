package practice;

public class FindPivotWithDuplicates {
	
	public static int RBS(int a[], int target) {
		int pivot = findPivotWithDuplicates(a);
		if(pivot == -1) return binarySearch(a,target,0,a.length -1);
		if(target == a[pivot]) return binarySearch(a,target,0,pivot);
		if(target >= a[0]) return binarySearch(a,target,0,pivot -1);
		return binarySearch(a,target,pivot + 1, a.length - 1);
	}
	
	private static int binarySearch(int[] a, int target, int i, int j) {
		int low = i;
		int high = j;
		int res = -1;
		while(low <= high) {
			int mid = (low + high) /2;
			if(a[mid] == target) {
				res = mid;
				high = mid -1;
			} else if(target > a[mid]){
			     low = mid + 1;
			} else if(target < a[mid]) {
				high = mid - 1;
			}
		}
		return res;
	}

	public static int  findPivotWithDuplicates(int a []) {
		int start = 0;
		int end = a.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(mid < end && a[mid] > a[mid + 1]) {
				return mid;
			}
			if(mid > start && a[mid] < a[mid - 1]) {
				return mid - 1;
			}
			if(a[mid] == a[start] && a[mid] == a[end]) {
				if(start+1 < a.length &&  a[start] > a[start + 1]) {
					return start;
				}
				start++;
				if(end -1 >= 0 && a[end] < a[end - 1]) {
					return end - 1;
				}
				end --;
			}
			else if (a[start] < a[mid] || (a[start] == a[mid] && a[mid] > a[end])) {
				start = mid + 1;
			  } else {
				end = mid - 1;
			  }
		}
		return -1;
	}

	public static void main(String[] args) {
		int a [] = {1, 1, 1, 2,2,2, 0};
		System.out.println(findPivotWithDuplicates(a));
//		System.out.println(RBS(a,0));

	}

}
