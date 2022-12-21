package strings;

public class StringIntroduction {

	public static void main(String[] args) {
		
		String cars = "Hyundai,Maruti,Swift,Wagnor,Ferrari,Lambourgini";
	    String allCars[] = cars.split(",");
	    
//	    for(String car: allCars) {
//	    	System.out.println(car);
//	    }
	    String i = "1";
	    String name = "    Anuj";
	    String [] a = new String[5];
	     a[0] = "fizzbuzz";
	    a[1] = i;
	    Math.pow(2, 3);
		System.out.println(a[0]);

	}

}
class Solution {
    public int isPower(int A) {
        int p;
        double x;
        for(int i = 0; i*i <= A ; i++) {
            x = Math.log(A) / Math.log(i);
            p = (int)x;
            if(Math.pow(i, p) == A) return 1;
            
        }
        return 0;
    }
}
