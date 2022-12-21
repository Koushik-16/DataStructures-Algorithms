package recursion;

public class PrintIncreasing {
	
	public static void PrintIncreasing(int n) {
		if(n == 1)  System.out.println(n);
		else {
			PrintIncreasing(n-1);
			System.out.println(n);
			}
	}

	public static void main(String[] args) {
		PrintIncreasing(10);

	}

}
