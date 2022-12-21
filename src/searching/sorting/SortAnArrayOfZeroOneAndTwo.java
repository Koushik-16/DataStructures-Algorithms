package searching.sorting;

public class SortAnArrayOfZeroOneAndTwo {

	public static int [] SortAnArrayOfZeroOneAndTwo(int a []) {
		int low = 0;
		int mid = 0;
		int high = a.length -1;
		int temp = 0;
		while(mid <= high) {
			if(a[mid] == 0) {
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
			}
			else if(a[mid] == 1) {
				mid++;
				
			}
			else if (a[mid] == 2) {
				temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high --;
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		int [] a = {1, 2, 0, 0, 0, 2, 2, 1};
		int [] b = SortAnArrayOfZeroOneAndTwo(a);
		for(int val : a) {
			System.out.print(val + ",");
		}

	}

}
