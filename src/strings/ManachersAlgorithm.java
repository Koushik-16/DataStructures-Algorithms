package strings;

public class ManachersAlgorithm {
	
	
	 public static int [] LPS(String s){
	        s = modify(s);
	        int lps [] = new int[s.length()];
	        int c = 0;
	        int r = 0;
	        for(int i = 1; i < s.length() - 1; i++){
	            int mir = c - (i - c);
	            if(r > i) lps[i] = Math.min(lps[mir], r -i);
	             while(s.charAt(i + lps[i] + 1) ==  s.charAt(i -lps[i] - 1)){
	                 lps[i]++;
	             }
	             if(i + lps[i] > r){
	                 r = i + lps[i];
	                 c = i;
	             }
	        }
	        return lps;
	        
	    }
	    
	    public static String modify(String s){
	        StringBuilder sb = new StringBuilder();
	        sb.append('@');
	        for(char ch : s.toCharArray()){
	            sb.append('#');
	            sb.append(ch);
	        }
	        sb.append('#');
	        sb.append('$');
	        return sb.toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
