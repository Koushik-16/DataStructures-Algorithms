package recursion;

public class Nthfibbonaci {
	
	public static long fibbonaci(int n) {
	return (long)((Math.pow(((1 + Math.sqrt(5)) /2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5)); 
	}

	public static void main(String[] args) {
		for(int i = 0 ; i < 15; i++) {
			System.out.println(fibbonaci(i));
		}
	}

}
