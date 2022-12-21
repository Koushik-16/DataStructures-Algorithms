package test;

import java.io.IOException;

public  class Z  {
	
	public static void main(String [] args) throws IOException {
		int a = 5;
		int b = 0;
		if(b == 0) 	throw new IOException("devide by 0");
		else System.out.println(a/b);
	}
	

}




