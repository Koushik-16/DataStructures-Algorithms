package recursion;

public class Experiment {
	
	static int fun1(int n) {
		int i = 0;
		if(n > 0) i = i+1;
		return i;
	}
	static int fun2(int n) {
		int i = 0;
		if(n > 0)  {
			i = i+fun1(n);
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println(fun2(5));

	}

}
