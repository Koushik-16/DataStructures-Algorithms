package arrays;

public class MajorityElement {
	
	public static int Majorityelement(int [] a) {
		int majority = a[0];
		int count = 1;
		for(int i = 1; i < a.length; i++) {
			if(a[i] == majority ) {
				count += 1;
			} else {
			count -= 1;
			if(count == 0) {
				majority = a[i];
				count = 1;
			}
			}
		}
		return majority;
	}

	public static void main(String[] args) {
		int [] a = {1,1,2,2,3};
		System.out.println(Majorityelement(a));

	}

}
