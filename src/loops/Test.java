package loops;

public class Test {

	public static void main(String[] args) {
	int n = 5;
		for(int i = 0 ; i <= n; i++) {
			for(int j  =1; j <= n - i ; j++) {
			   System.out.println(" ");
			}
			System.out.print("*");
			
		}

	}

}
