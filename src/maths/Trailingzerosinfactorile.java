package maths;

public class Trailingzerosinfactorile {
	
	public static int solution(int n ) {
		int ans = 0;
		for(int i = 5; i<= n ; i = i * 5) {
			ans = ans + (n / i);
		}
		return ans ;
	}

	public static void main(String[] args) {
		     System.out.println(solution(50));
	}

}
