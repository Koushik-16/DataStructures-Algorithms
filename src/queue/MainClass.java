package queue;



public class MainClass {

	public static void main(String[] args) {
		
	MyQueue<Integer> mq = new MyQueue<>();
	
	mq.enqqueue(12);
	mq.enqqueue(2);
	mq.enqqueue(123);
	mq.enqqueue(45);
	
	System.out.println(mq.dequeue());
	}

}
