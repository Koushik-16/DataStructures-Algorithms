package dp;

import java.util.*;


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

class Trie {
	
	private  Node root;
	
   Trie(){
	   root = new Node();
   }
   
  public  void insert(String word) {
	   Node node = root;
	   for(int i = 0 ; i < word.length() ; i++) {
		   if(!node.containsKey(word.charAt(i))) {
			   node.put(word.charAt(i), new Node());
		   }
		  node = node.get(word.charAt(i));
	   }
	   node.setEnd();
   }
   
 public   boolean search(String word) {
	   Node node = root;
	   for(int i  = 0 ; i < word.length() ; i++) {
		   if(!node.containsKey(word.charAt(i))) {
			   return false;
		   }
		   node = node.get(word.charAt(i));
	   }
	   return node.isEnd();
   }
	
   
   public  boolean startWith(String prefix) {
	   Node node = root;
	   for(int i  = 0 ; i < prefix.length() ; i++) {
		   if(!node.containsKey(prefix.charAt(i))) {
			   return false;
		   }
		   node = node.get(prefix.charAt(i));
	   }
	   return true;
   }
   
}

public class WordBreak2 {
	
	static List<String> ans = new ArrayList<>();
	static Trie t = new Trie();
	
	 public static List<String> wordBreak(String s, List<String> wordDict) {
		 for(String  word : wordDict) {
			 t.insert(word);
		 }
		 
		 for(int i = 0 ; i < s.length() ;++i) {
			 if(t.search(s.substring(0,i+ 1))) {
				 solve(s,s.substring(0, i + 1),i+ 1);
			 }
		 }
		 
		 return ans;
	 }

	public static void solve(String s, String st, int pos) {
		if(pos == s.length()) {
			ans.add(st);
			return ;
		}
		st += " ";
		for(int i = pos ; i < s.length() ; i++) {
			if(t.search(s.substring(pos,i+ 1))) {
				solve(s,st + s.substring(pos,i+1), i+ 1);
			}
		}
		
	}




	public static void main(String[] args) {
		

	}

}
