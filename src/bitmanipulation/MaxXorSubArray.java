package bitmanipulation;

public class MaxXorSubArray {

	
	int maxSubarrayXOR(int N, int arr[]){    
	       if(N==1) return (arr[0]);
	       int max_so_far = 0;
	       int curr_max = 1;
	       for(int i=0; i<N; i++){
	           curr_max = Math.max(arr[i],arr[i] ^ curr_max);
	           max_so_far = Math.max(max_so_far,curr_max);
	       }
	       return (max_so_far);
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
