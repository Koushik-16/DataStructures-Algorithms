package introduction;
import java.util.Scanner;
public class Balance {
	
	 public static double balance(double bal , int with){
		 if ((double)with > bal) {
	            return bal;  
		 }
		 else if(with % 5 == 0 ) {
	            bal = bal - (double)with - 0.5;
	            return bal;
	        }
	        else 
	        {
	            return bal;
	        }
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double bal = sc.nextDouble();
		int with = sc.nextInt();
		System.out.println(balance(bal,with));
	}

}
