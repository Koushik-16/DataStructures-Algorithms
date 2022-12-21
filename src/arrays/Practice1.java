package arrays;

public class Practice1 {

	public static void main(String[] args) {
		
		 int a[] = {10,12,25,16};
	      int sum = 0;
	      for(int i =0; i<a.length; i++) {
	          sum +=a[i];
	      }
		if(sum % 2 == 0) {
			System.out.println("the sum is an even number");
		} else {
			System.out.println("add 1 to form the sum even");

		} 
	}

}
