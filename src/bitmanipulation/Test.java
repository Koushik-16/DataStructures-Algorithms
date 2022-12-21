package bitmanipulation;

public class Test {

	public static void main(String[] args) {
		int n = 15;
		int b = (int)(Math.log10(n) /Math.log10(2));
//		 int b =  (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
//         int ans = Integer.bitCount(n);
		double r = 9.8;
		double pi = 3.14;
		double a = pi * r * r;
         System.out.println(a);
         
        String  s = Integer.toBinaryString(5);
        System.out.println(s);
		 
		 
		  
		
	}

}
