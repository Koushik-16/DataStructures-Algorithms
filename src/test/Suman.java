package test;


public class Suman  {
	
	public static  void change(int a , int [] b) {
		a = 10;
		b[0] = 6;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b [] = {9};
		change(a,b);
		System.out.println(a);
		System.out.println(b[1]);
		
		
	}

	
}




 
 

