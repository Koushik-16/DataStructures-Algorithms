package backtracking;

import java.util.ArrayList;

public class GreyCode {
	
	public static ArrayList<String> greyCode(int bit){
		if(bit == 1) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("0");
			bres.add("1");
			return bres;
		}
		ArrayList<String> prev = greyCode(bit - 1);
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 0 ; i < prev.size() ; i++) {
			ans.add("0" + prev.get(i));
		}
		
		for(int i = prev.size() - 1 ; i >= 0 ; i --) {
			ans.add("1" + prev.get(i));
		}
		 return ans;
		
	}

	public static void main(String[] args) {
		ArrayList<String> a = greyCode(4);
		System.out.println(a);

	}

}
