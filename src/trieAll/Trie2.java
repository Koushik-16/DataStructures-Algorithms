package trieAll;


class Node {
	
	Node links [] = new Node[26];
	int endsWith = 0;
	int countPrefix = 0;
	
	public Node() {};
	
	boolean containsKey(char ch ) {
		return links[ch - 'a'] != null;
	}
	
	Node get(char ch) {
		return links[ch - 'a'];
	}
	
	void put(char ch , Node node) {
		links[ch - 'a'] = node;
	}
	
	void increaseEnd() {
		endsWith++;
	}
	
	void increasePrefix() {
		countPrefix++;
	}
	
	void deleteEnd() {
		endsWith--;
	}
	
	void reducePrefix() {
		countPrefix--;
	}
	int getEnd() {
		return endsWith;
	}
	
	int getPrefix() {
		return countPrefix;
	}
	
}

public class Trie2 {
	
	public static Node root;
	
	public Trie2(){
		root = new Node();
	}
	
	 void insert(String word) {
		Node node = root;
	   for(int i = 0 ; i < word.length() ; i++) {
		   char ch = word.charAt(i);
		   if(!node.containsKey(ch)) {
			   node.put(ch, new Node());
		   }
		 node = node.get(ch);
		 node.increasePrefix();
	   }
	   node.increaseEnd();
	}
	
	 int countWordSEqualTO(String word) {
		Node node = root;
		for(int i= 0 ; i < word.length() ; i++) {
			char ch = word.charAt(i);
			if(node.containsKey(ch)) {
				node = node.get(ch);
			}else return  0;
		}
		return node.getEnd();
	}
	
	 int countWordsStartsWith(String prefix) {
		Node node = root;
		for(int i= 0 ; i < prefix.length() ; i++) {
			char ch = prefix.charAt(i);
			if(node.containsKey(ch)) {
				node = node.get(ch);
			}else return  0;
		}
		return node.getPrefix();
	}
	
	 void erse(String word) {
		Node node = root;
		for(int i= 0 ; i < word.length() ; i++) {
			char ch = word.charAt(i);
			if(node.containsKey(ch)) {
				node = node.get(ch);
				node.reducePrefix();
			}else return ;
	     }
		node.deleteEnd();
	}
	
	
	
	

	public static void main(String[] args) {
		

	}
	
}
