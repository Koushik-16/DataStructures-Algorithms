package bitmanipulation;

public class Reversebits {

		public static long reverse(long a) {
			long rev = 0;
	        for (int i = 0; i < 32; i++) {
		        rev = rev << 1;
		        if ((a & (1 << i)) != 0)  rev |= 1;
		    }
		    return rev;
		}

	public static void main(String[] args) {
		
        System.out.println(reverse(3));
	}

}
