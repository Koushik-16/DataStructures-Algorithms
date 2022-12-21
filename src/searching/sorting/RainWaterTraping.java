package searching.sorting;

public class RainWaterTraping {//correct
	
	public static int water(int hight[]) {
		int res =  0 ;
		int left = 0 ;
		int right  = hight.length - 1;
		int leftmax = 0 ;
		int rightmax = 0;
		while(left <= right) {
			if(hight[left] <= hight[right]) {
				if(hight[left] > leftmax) leftmax = hight[left];
				else res += leftmax - hight[left];
				left ++;
			}
			else {
				if(hight[right] > rightmax) rightmax = hight[right];
				else res += rightmax - hight[right];
				right--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
