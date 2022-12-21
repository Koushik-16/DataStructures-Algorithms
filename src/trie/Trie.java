package trie;

	 class Node {
		Node [] links = new Node[26];
		boolean flag = false;
		
		public Node () {
			
		}
		boolean containsKey(char ch) {
			return (links[ch - 'a'] != null);
		}
		Node get(char ch) {
			return links[ch - 'a'];
		}
		void put(char ch , Node node) {
			links[ch - 'a'] = node;
		}
		void setEnd() {
			flag = true;
		}
		boolean isEnd() {
			return flag;
		}				      
	}
	
	public class Trie {
		
		private static Node root;
		
	   Trie(){
		   root = new Node();
	   }
	   
	  public static void insert(String word) {
		   Node node = root;
		   for(int i = 0 ; i < word.length() ; i++) {
			   if(!node.containsKey(word.charAt(i))) {
				   node.put(word.charAt(i), new Node());
			   }
			  node = node.get(word.charAt(i));
		   }
		   node.setEnd();
	   }
	   
	 public static  boolean search(String word) {
		   Node node = root;
		   for(int i  = 0 ; i < word.length() ; i++) {
			   if(!node.containsKey(word.charAt(i))) {
				   return false;
			   }
			   node = node.get(word.charAt(i));
		   }
		   return node.isEnd();
	   }
		
	   
	   public static boolean startWith(String prefix) {
		   Node node = root;
		   for(int i  = 0 ; i < prefix.length() ; i++) {
			   if(!node.containsKey(prefix.charAt(i))) {
				   return false;
			   }
			   node = node.get(prefix.charAt(i));
		   }
		   return true;
	   }
	   
	   public String completeString(int n , String words []) {
		   String longest = "";
		   for(String s : words) {
			   insert(s);
		   }
		   for(String s : words) {
			   if(checkAllExists(s)) {
				   if(s.length() > longest.length()) longest = s;
				   else if(s.length() == longest.length() && s.compareTo(longest) < 0) longest = s;
			   }
		   }
		   if(longest == "") return "None";
		   return longest;
	   }
		
		
	private boolean checkAllExists(String s) {
		boolean fl = true;
		Node node = root;
		for(int i = 0 ; i < s.length() && fl; i++) {
			char ch = s.charAt(i);
			   if(node.containsKey(ch)) {
				   node = node.get(ch);
				   fl = fl & node.isEnd();
			   }else return false;   
		}
		return fl;
	}
	
	public static int countDistinctSubstrings(String s ) {
		
		int n = s.length();
		int count = 0;
		for(int i= 0; i < n ; i++) {
			Node node = root;
			for(int j = i ; j < n; j++) {
				char ch = s.charAt(j);
				if(!node.containsKey(ch)) {
					node.put(ch, new Node());
					count++;
				}
				node = node.get(ch);
			}
		}
		return count+1;
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append('a');
		sb.append('b');
		sb.deleteCharAt(sb.length() - 1);
//		System.out.println(sb.toString());
		int i = 3;
		char ch = (char) ('a' + i);
		System.out.println(ch);

	}

}
