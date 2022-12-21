package dynamicProgramming;

public class ArrangeBuilding {
	
	public static long arrangeBuilding(int length) {
		long ob = 1;
		long os = 1;
		for(long i = 2 ; i <= length ; i++) {
			long nb = os;
			long ns = os + ob;
			
			os = ns;
			ob = nb;
		}
		long total = os + ob;
		return total * total;
	}

	public static void main(String[] args) {
		

	}

}
