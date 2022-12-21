package practice;

public class GraterThanTarget {
	
	public static char nextGrater(char [] character , char target) {
		int low = 0;
		int high = character.length-1;
		while(low <= high) {
			int mid = low + (high - low) /2;
			if(target < character[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return character[low % character.length];
	}

	public static void main(String[] args) {
		

	}

}
