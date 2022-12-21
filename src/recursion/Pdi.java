package recursion;

public class Pdi {
	
	public static void Pdi(int n) {
		if(n ==0 ) return ;
		System.out.println(n);
		Pdi(n-1);
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		Pdi(5);

	}

}
