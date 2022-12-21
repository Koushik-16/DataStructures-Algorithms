package greedyAlgorithm;

public class ValidParentheseString {
	
	 public boolean checkValidString(String s) {
	        int leftmin = 0;
	        int leftmax = 0;
	        for(int i = 0 ; i < s.length() ; i++){
	            char ch = s.charAt(i);
	            if(ch == '('){
	                leftmax++;
	                leftmin++;
	            }
	            else if(ch == ')'){
	                leftmax--;
	                leftmin--;
	            }else{
	                leftmax++;
	                leftmin--;
	            }
	            if(leftmin < 0) leftmin = 0;
	            if(leftmax < 0) return false;
	        }
	        return leftmin == 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
