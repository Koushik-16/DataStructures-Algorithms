package maths;

public class ReverseInteger {
	
	 public static int reverse(int x) {
	        boolean negetive = false ;
	        long reversed = 0;
	        if ( x < 0 ){
	         x = x * -1;
	        negetive = true;
	        }
	        
	        while( x >  0){
	            reversed = (reversed * 10 ) + (x % 10);
	            x = x / 10 ;
	        }
	        if ( reversed > Integer.MAX_VALUE) return 0;
	        return negetive ? (int)(reversed * -1): (int)reversed;
	    }

	public static void main(String[] args) {
		
	}

}
