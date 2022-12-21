package strings;

public class Decrypt {
	
	 public static char kThCharater(String s, Long k)  {
		 if(k == 0) return s.charAt(0);
		 int n = s.length();
		  long num = 0;
		  int i = 0;
		  String curr = "";
		  while(i < n) {
			   num = 0;
			  StringBuilder sb = new StringBuilder();
			  while(i < n && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				  sb.append(s.charAt(i));
				  i++;
			  }
			   curr = sb.toString();
			  long d = 0;
			  while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				  d= (d*10) + (s.charAt(i) - '0');
				  i++;
			  }
			  num = curr.length()*d;
			  if(num < k) {
				 k = k - num; 
			  }else if(num == k) {
				  return curr.charAt(curr.length() - 1);
			  }else {
				  break;
			  }
		  }
		  
		  long mod = k % curr.length();
		  if(mod == 0) return curr.charAt(curr.length() - 1);
		  else return curr.charAt((int)mod -1);
	    }

	public static void main(String[] args) {
		System.out.println(kThCharater("leet2code3",(long)13));
		

	}

}
