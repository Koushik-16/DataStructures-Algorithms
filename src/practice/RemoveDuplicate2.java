package practice;

import java.util.ArrayList;

public class RemoveDuplicate2 {
	
	public static int removeDuplicates(ArrayList<Integer> a) {
        int n = a.size();
        if(n < 3) return n;
        int slow = 2;
        int fast = 2;
        while(fast < a.size()){
            if(a.get(fast) != a.get(slow - 2)){
            	int put = a.get(fast);
                a.set(slow, put);
                slow ++;
            }
            fast++;
        }
        return slow;
	}

	public static void main(String[] args) {
	
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(11);
		a.add(11);
		a.add(12);
		a.add(12);
		a.add(12);
		System.out.println(removeDuplicates(a));
		for(int val  = 0 ; val < a.size(); val ++) {
			System.out.println(a.get(val));
		}

	}

}
