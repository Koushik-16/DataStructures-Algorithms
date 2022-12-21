package greedyAlgorithm;

public class JumpGame2 {
	
	public static int minJump(int arr []) {
		int jump = 0;
		int n = arr.length ;
		int begin = 0, end = 0, last = 0;
		for(int i = 0 ; i < n-1 ; i++) {
			last = Math.max(last, i + arr[i]);
			if(i == end) {
				jump++;
				end = last;
			}
		}
		return jump;
	}

	public static void main(String[] args) {
		

	}

}
