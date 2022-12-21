package bitmanipulation;

public class Trailingzeros {
	
	public static int Trailingzeros(int a) {
		int counter = 0;
		while((a&1) == 0) {
			counter++;
			a = a>>1;
		}
		return counter;
	}

	public static void main(String[] args) {
		
		System.out.println(Trailingzeros(9));

	}

}
