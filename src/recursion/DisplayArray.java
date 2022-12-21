package recursion;

public class DisplayArray {
	
//	public static void DisplayArray(int [] a,int n ) {
//	   if(n == 1) System.out.println(a[0]);
//	   else {
//		   DisplayArray(a,n-1);
//		   System.out.println(a[n-1]);
//	   }
//	}
	public static void DisplayArrayReverse(int [] a, int n) {
		if(n == 1) System.out.println(a[0]);
		else {
			System.out.println(a[n-1]);
			DisplayArrayReverse(a, n-1);
		}
	}
	
	public static void main(String[] args) {
		int a [] = {2, 46, 235, 2, 55, 25};
          DisplayArrayReverse(a,a.length);
	}
}
