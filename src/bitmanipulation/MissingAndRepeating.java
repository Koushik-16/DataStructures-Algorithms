package bitmanipulation;

public class MissingAndRepeating {
	
	public static void MissingAndRepeating(int a[]) {
		int xor = 0;
		for(int i = 0 ; i < a.length ; i++) {
			xor = xor^a[i];
		}
		for(int i = 1; i <= a.length ; i++) {
			xor = xor^i; // x^y
		}
		int rsb = xor & -xor;
		int x = 0 ;
		int y = 0 ;
		for(int val: a) {
			if((rsb & val) == 0 ) {
				x = x ^ val;
			} else {
				y = y ^ val;
			}
		}
		for(int i = 0 ; i <= a.length ; i++) {
			if((rsb & i) == 0 ) {
				x = x ^ i;
			} else {
				y = y ^ i;
			}
		}
		for(int val : a) {
			if(val == x) {
				System.out.println("duplicate is " + x);
				System.out.println("missing is " + y);
				break;
			} else if ( val == y) {
				System.out.println("duplicate is " + y );
				System.out.println("missing is " + x);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		

	}

}
