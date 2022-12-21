package maths;

public class ModuloArithmatics {
	 public static int pow(int x, int n, int d) {
         if(x==0){
           return 0;
       }
       if(n==0){
           return 1;
       }
     
       if(x<0){
           return pow(x+d, n, d);
       }
       long ans;
       long temp= pow(x, n/2,d);
       if(n%2==0){
          ans =((temp%d)*(temp%d))%d;
       }else{
           ans= ((((x%d)*(temp%d))%d)*(temp%d))%d;
       }
       
       return (int)ans;
       
       
       
       
       
   }
	public static void main(String[] args) {
		
		System.out.println(pow(-1,1,20));

	}
	
	static long fastPower(int a, int b , int n) {
		long res = 1;
		while(b > 0) {
			if((b&1) != 0) {
				res = (res  * a % n) % n;
			}
			a =( a % n * a % n) % n;
			 b = b >>1;
		}
		return res;
	}

}
