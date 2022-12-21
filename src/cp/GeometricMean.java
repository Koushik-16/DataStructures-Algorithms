package cp;
import java.util.*;

public class GeometricMean {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t -- > 0) {
				int n = sc.nextInt();
				int arr [] = new int[n];
				for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();
				int one = 0;
				int minusone = 0;
				for(int val : arr) {
					if(val == 1) one++;
					else if(val == -1) minusone++;
				}
				if(Math.abs(minusone - one) > 2) System.out.println("No");
				else if(Math.abs(minusone - one) == 0) System.out.println("Yes");
				else if(Math.abs(minusone - one) != 0) {
					if(minusone % 2 == 1 && one %2 == 1) System.out.println("No");
					else System.out.println("Yes");
					
					
				}
							
			}
			
		}catch(Exception e) {
			return ;
		}

	}

}
