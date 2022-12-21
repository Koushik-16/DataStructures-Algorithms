package cp;

import java.util.Scanner;

public class Test {
	
	public static int func(int arr []) {
		int z = 0;
	    int neg = 0;
	    for(int val : arr) {
	    	if(val < 0) neg++;
	    	if(val == 0) z++;
	    }
	    return neg % 2;
	    
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t -- > 0) {	
			int n = sc.nextInt();
			int arr [] = new int[n];
			for(int i = 0; i < n ;i++) arr[i] = sc.nextInt();
			int ans = func(arr);
			 System.out.println(ans);
		}

	}

}
