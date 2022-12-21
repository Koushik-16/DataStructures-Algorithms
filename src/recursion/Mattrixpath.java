package recursion;

public class Mattrixpath {
	
	public static int count(int n , int m) {
		if(n == 1 || m == 1  ) {
			return 1;
		}
		return count(n -1, m) + count(n, m-1);
	}

	public static void path(String p , int rows, int cols) {
		if(rows == 1 && cols == 1) {
			System.out.println(p);
			return ;
		}
		
		if(rows > 1 && cols > 1 ) {
			path(p + "D", rows - 1, cols - 1);
		}
		
		if(rows > 1) {
			path(p + "V",rows - 1, cols);
		}
		if(cols > 1) {
			path(p + "H",rows , cols - 1);
		}
	}
	
	public static void main(String[] args) {
	    path("",3,3);

	}

}
