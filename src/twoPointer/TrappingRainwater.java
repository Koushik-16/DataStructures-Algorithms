package twoPointer;

public class TrappingRainwater {
	
	public static int trap(int hight[]) {
		int n = hight.length;
		int res = 0;
		int left = 0;
		int right = n- 1;
		int leftmax = 0;
		int rightmax = 0;
		while(left <= right) {
			if(hight[left] <= hight[right]) {
				
				if(hight[left] >= leftmax) leftmax = hight[left];
				else res +=leftmax - hight[left];
				left++;
			}
			  else {
				if(hight[right] >= rightmax) rightmax = hight[right];
				else res += rightmax - hight[right];
				right --;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "";
		int z = 10;
	     int c = 'a' + z;
	     char ch = (char)c;
	     System.out.println(ch);
	     String x = "dc";
	     System.out.println(s.compareTo(x));

	}

}
