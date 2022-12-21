package recursion;

public class PermutationOfAString {

	public static String swap(String a, int i, int j) { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
	 static void permute(String str, int l, int r)  { 
	        if (l == r) 
	            System.out.println(str); 
	        else { 
	            for (int i = l; i <= r; i++)  { 
	                str = swap(str,l,i); 
	                permute(str, l+1, r); 
	                str = swap(str,l,i); 
	            } 
	        }
	    }
	 
	 public static void permutation(String ques, String asf) {
		 if(ques.length() == 0) {
			 System.out.println(asf);
			 return ;
		 }
		 for(int i  = 0 ; i < ques.length(); i++ ) {
			 char ch = ques.charAt(i);
			 String qlpart = ques.substring(0,i);
			 String qrpart = ques.substring(i+1);
			 String rop = qlpart + qrpart;
			 permutation(rop,asf+ch);
		 }
	 }
	 
      public static void main(String[] args) {
    	  
    	  String str = "ABC"; 
          int n = str.length(); 
//          permute(str, 0, n-1);
          permutation(str,"");
		
	}

}
