package greedyAlgorithm;

import java.util.Arrays;

public class Candy {

	public static  int candy(int[] ratings) {
	     int []candy=new int[ratings.length];
	      Arrays.fill(candy,1);
	      int sum=0;
	    for(int i=0;i<ratings.length-1;i++) {
	       if(ratings[i+1]>ratings[i]) {
	         candy[i+1]=candy[i]+1;
	      }
	    }
	    for(int i=ratings.length-1;i>0;i--) {
	       if(ratings[i-1]>ratings[i] && candy[i-1]<=candy[i]) {
	          candy[i-1]=candy[i]+1;
	       }
	     }
	    for(int i=0;i<candy.length;i++) {
	        sum=sum+candy[i];
	   }
	    return sum;
	 }
	
	public static void main(String[] args) {
		
	}

}
