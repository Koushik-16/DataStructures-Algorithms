package recursion;

public class Powerset {

	static void Powerset(String s, int i , String cur) {
		if(i == s.length()) {
			System.out.println(cur);
			return ;
		}
		Powerset(s, i+1, cur + s.charAt(i));
		Powerset(s, i+1, cur);
	}
	
	public static void main(String[] args) {
		
		String s = "abc";
		int i = 0;
		String cur = "";
		Powerset(s, i, cur);

	}

}
