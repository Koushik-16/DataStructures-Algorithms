package maths;

public class Test {
	public static boolean judgeSquareSum(int c) {
        int a =(int)Math.sqrt(c);
        int i = 0;
        int j = a;
        while(i <= j){
        	System.out.println(i);
        	System.out.println(j);
            int sum = (i * i) + (j * j);
            if(sum == c) return true;
            else if(sum > c) j--;
            else if(sum < c) i++;
        }
        return false;
    }

	public static void main(String[] args) {
//		boolean a = judgeSquareSum(157);
		int a = 4^5^6^7;
		System.out.println(a);
	}

}
