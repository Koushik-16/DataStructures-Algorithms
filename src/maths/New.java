package maths;

public class New {
	public static  int countPrimes(int n) {
        if(n == 0 || n == 1) return 0;
        int count = 0;
       for(int i = 2; i < n ; i++ ){
           if(isPrime(i)== true) count ++;
       }
        return count;
    }
    public static boolean isPrime(int a){
        for(int i = 2 ; i * i <= a ; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		System.out.println(countPrimes(10));

	}

}
