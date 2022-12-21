package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		while(temp > 0) {
			
			int lastDigit = temp % 10;
			
			reversedNumber = reversedNumber * 10 + lastDigit;
			
			temp /=10;

		}
		System.out.println("The reversed number is"+" " + reversedNumber);
		
		if(reversedNumber == n) {
			System.out.println(n +" is a palindrome number");
		} else {
			System.out.println(n +" is not a palindrome number");
		}
		

	}

}
 class Solution {
    public int reverse(int A) {
        long reverse = 0;
        int sign = A >= 0 ? 1 : -1;
        A = Math.abs(A);
        while (A > 0) {
            reverse = reverse * 10 + A % 10;
            A /= 10;
        }
        reverse *= sign;
        return reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ? 0 : (int)reverse;
    }
}

