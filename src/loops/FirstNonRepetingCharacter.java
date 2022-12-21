package loops;

public class FirstNonRepetingCharacter {
	
	char firstNonRepetingCharacter (String s) {
		
		for(int i = 0; i <s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		return'_';
		
	}

}
