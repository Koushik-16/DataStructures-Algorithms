package recursion;

public class MaxOfArray {
	
	public static int solution(int[] a ,int index) {
		if(index == a.length-1) {
			return a[index];
		}
		int mosa = solution(a, index+1);
		if(mosa > a[index]) {
			return mosa;
		} else {
			return a[index];
		}
		
	}

	public static void main(String[] args) {
		int [] a = {22, 33, 7, 3, 9, 4}; 
		System.out.println(solution(a,0));

	}

}
