package questions;

public class NumberOfArrays {
	
	public int numberOfArrays(int[] diff, int lower, int upper) {
        long min = (long)lower;
        long max = (long)lower;
        long ele = (long)lower;
        for(int val : diff){
            ele += val;
            min = Math.min(ele,min);
            max = Math.max(ele,max);
        }
        long ans = (upper - lower) - (max - min) + 1;
        if(ans < 0) ans = 0;
        return (int)ans;
    }

	public static void main(String[] args) {
		

	}

}
