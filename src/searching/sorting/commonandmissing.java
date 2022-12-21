package searching.sorting;

import java.util.ArrayList;

public class commonandmissing {
	static ArrayList<Integer> repeatedNumber(int[] A) 
    {
        int len = A.length;
        int Sum_N = (len * (len + 1)) / 2;
        int Sum_NSq = (len * (len + 1) * 
                         (2 * len + 1)) / 6;
        int missingNumber = 0, repeating = 0;
 
        for (int i = 0; i < A.length; i++) 
        {
            Sum_N -= A[i];
            Sum_NSq -= A[i] * A[i];
        }
 
        missingNumber = (Sum_N + Sum_NSq / Sum_N) / 2;
        repeating = missingNumber - Sum_N;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missingNumber);
        return ans;
    }

	public static void main(String[] args) {
		

	}

}
