package thread;

public class Question implements Runnable {
	int i;
	
	Question(int i ){
		this.i = i;
	}


	@Override
	public void run() {
		double ans = Math.sqrt(i);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 30 ; i++) {
			Question q = new Question(i);
			Thread t = new Thread(q);
			t.start();
		}
			
			
	
	}

}
