package twoPointer;

public class RemoveDuplicates {
	
	public static int RemoveDuplicates(int a []) {
		if(a.length == 0) {
			return 0;
		}
		int i = 0;
	    for(int j = 1; j < a.length; j++ ) {
	    	if(a[i] != a[j]) {
	    		i++;
	    		a[i] = a[j];
	    	}
	    }
	    return i + 1;
	}

	public static void main(String[] args) {
		int a [] = {1, 1,1 ,2, 4, 5};
       System.out.println(RemoveDuplicates(a));
	}

}
