package thread;

public class SquareRoot extends Thread {
	int i;
	
	SquareRoot(int i){
		this.i = i;
	}
	
	public void run() {
		int ans = (int)Math.sqrt(i);
		System.out.println(ans);
	}

	public static void main(String[] args) {
		for(int i = 0; i <= 30 ; i++) {
			SquareRoot s = new SquareRoot(i);
			s.start();
		}

	}

}
