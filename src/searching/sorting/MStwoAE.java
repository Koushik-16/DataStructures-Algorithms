package searching.sorting;

public class MStwoAE {

 static int MaximumSum(int [] a) {
	 int n = a.length;
	 int sum = a[0] + a[1];
	 for(int i = 1; i < n-1; i++) {
		 sum = Math.max(sum, a[i] + a[i+1]);
	 }
	 return sum;
 }
	
	public static void main(String[] args) {
		int [] a = {5, 9, 4, 7,20, 3, 4, 8, 10};
		System.out.println(MaximumSum(a));

	}

}
