package vectorAndStacks;

public class MinimumBracketAdd {
	
	public static int minParentheses(String p) {
       
        int bal = 0;
        int ans = 0;
       
        for (int i = 0; i < p.length(); ++i) {
       
            bal += p.charAt(i) == '(' ? 1 : -1;
       
            if (bal == -1) {
                ans += 1;
                bal += 1;
            }
        }
       
        return bal + ans;
    }

	public static void main(String[] args) {
		String s = "()()()";
		System.out.println(minParentheses(s));

	}

}
