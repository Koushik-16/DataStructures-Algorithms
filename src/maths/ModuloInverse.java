package maths;

public class ModuloInverse {
	

   public static  int modInverse(int A, int M) {
     int g = gcd(A, M);
     if (g != 1)
        return -1;
     else {
       
         return  power(A, M - 2, M);
     }
 }

   public static int power(int x, int y, int M)  {
     if (y == 0)
         return 1;
     int p = power(x, y / 2, M) % M;
     p = (int)((p * (long)p) % M);
     if (y % 2 == 0)
         return p;
     else
         return (int)((x * (long)p) % M);
 }

   public static int gcd(int a, int b) {
     if (a == 0)
         return b;
     return gcd(b % a, a);
 }

	public static void main(String[] args) {
		

	}

}
