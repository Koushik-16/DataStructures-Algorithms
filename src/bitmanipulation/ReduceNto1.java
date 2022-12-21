package bitmanipulation;

public class ReduceNto1 {
	
	public static int minSteps(long n) {
		int res = 0;
		
		while(n != 1) {
			if( n % 2 == 0) {
				n = n / 2;
			} else if(n == 3) {
				n = n - 1;
				}else if((n&3) == 1) {
					n = n -1;
				}else if((n&3) == 3) {
					n = n + 1;
				}
			res ++;
			}
			return res;
		}

	public static void main(String[] args) {
		System.out.println(minSteps(15));

	}

}
