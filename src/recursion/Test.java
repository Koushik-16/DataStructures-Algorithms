package recursion;

public class Test {

	public static boolean isSorted(int a [] , int i ) {
		if(i == a.length - 1) return true;
		return (a[i] <= a[i+1]) && isSorted(a,i+1);
	}
	
	public static void main(String[] args) {
		int a [] = {1, 2, 4,3,8, 9};

		boolean b = isSorted(a,0);
		System.out.println(b);
		
		
	}

}
