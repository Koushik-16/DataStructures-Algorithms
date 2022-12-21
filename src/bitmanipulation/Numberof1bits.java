package bitmanipulation;

public class Numberof1bits {
	
	 public static int numSetBits(long a) {
	        int counter = 0;
		 while(a != 0) {
			 a = (a&(a-1));
			 counter++;
		 }
		 return counter;
	    }
	 public static void main(String [] args) {
		 System.out.println(numSetBits(5));
	 }
}
