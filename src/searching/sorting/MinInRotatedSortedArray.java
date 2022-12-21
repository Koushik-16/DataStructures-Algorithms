package searching.sorting;

public class MinInRotatedSortedArray {
	
	public static int FimdMinInRotatedSortedArray(int [] a ) {
        int low = 0 ;
        int high = a.length-1;
        if(a[low] <= a[high]) {
        	return a[0];
        }
        while(low <= high) {
        	int mid = (low + high) / 2;
        	if(a[mid] > a[mid+1]) {
        		return a[mid + 1];
        	} else if(a[mid] < a[mid-1]) {
        		return  a[mid];
        	}else if (a[low] <= a[mid] ){
        		low = mid +1;
        	} else if (a [mid] <= a[high] ) {
        		high = mid -1; 
        	}
         }
        return -1;
	}

	public static void main(String[] args) {
		int [] a = {1, 1, 1,1 ,1};
		System.out.println(FimdMinInRotatedSortedArray(a));
		
	}

}
