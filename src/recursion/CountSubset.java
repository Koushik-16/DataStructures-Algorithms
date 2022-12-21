package recursion;

public class CountSubset {
	static String s = "";
	public static int count(int a [] , int target) {
		int count [] = new int[1];
		
		helper(a,0,count);
		System.out.println(s);
		return count[0];
		
	}

	private static void helper(int[] a,int index, int[] count) {
		if(index >= a.length) return ;
		
		helper(a,index + 1, count);
		helper(a,index + 1, count);
		
	}

	public static void main(String[] args) {
            int a [] = {2, 3, 5, 6,8,10};
            int target = 10;
            System.out.println(count(a,target));
	}

}
