package strings;

public class Reverse {
	
public static String reverse(String s) {
	
	int i = s.length()-1;
	String ans ="";
	while(i >= 0) {
	while(i >= 0 && s.charAt(i) ==' ')	i --;
	int j = i;
	if(i < 0) break;
	while(i >= 0 && s.charAt(i) !=' ') i--;
	if(ans.isEmpty()) {
		ans = ans.concat(s.substring(i+1,j+1));
	} else {
		ans = ans.concat(" "+s.substring(i+1,j+1));
	}
	
		
    	}	
	return ans;
	}
public static void main(String[] args) {
	String s1 = "asdfghjk";
	 String s = "The sky is blue";
	System.out.println(reverse(s));
	StringBuilder sb = new StringBuilder();
  sb.append(s1.substring(2,5));
  sb.isEmpty();
  
}
 
}		

	


