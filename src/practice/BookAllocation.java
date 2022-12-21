package practice;

public class BookAllocation {
	
	public static int Allocate(int pages [], int student) {
		int res = -1;
		int low = MinOf(pages);
		int high = SumOf(pages);
		while(low <= high) {
			int mid = (low + high) /2;
		if(allocatonIsPossible(pages, mid, student)) {
			res = mid;
			high = mid - 1;
		} else {
			low = mid + 1;
		}
		}
		return res;
	}

	private static boolean allocatonIsPossible(int[] pages, int mid, int student) {
		int StudentRequired = 1;
		int sum = 0 ;
		for(int i = 0 ; i < pages.length ; i++) {
			if(pages[i] > mid) {
				return false;
			}
			if(sum + pages[i] > mid) {
				StudentRequired++;
				sum = pages[i];
				if(StudentRequired > student ) {
					return false;
				}
			} else {
				sum += pages[i];
			}
		}
		
		return true ;
	}

	private static int SumOf(int[] pages) {
		int sum  = 0;
		for(int i = 0; i < pages.length ; i++) {
			sum += pages[i];
		}
		return sum;
	}

	private static int MinOf(int[] pages) {
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < pages.length; i++) {
			min = Math.min(min, pages[i]);
		}
		return min;
	}

	public static void main(String[] args) {
		

	}

}
