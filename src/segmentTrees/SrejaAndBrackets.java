package segmentTrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class SrejaAndBrackets {
	
	static class Node{
		int open;
		int close;
		int full;
		public Node( int open , int close , int full){
			this.open =  open;
			this.close = close;
			this.full = full;
		}
		
		public Node() {};
		
	}
	
	public static void build(int ind , int low , int high , Node seg [], char ch []) {
		if(low == high) {
			seg[ind] = new Node();
			if(ch[low] == '(') seg[ind].open++;
		    if(ch[low] == ')') seg[ind].close++;
		    return ;
		}
		int mid = (low + high) /2;
		build((2 * ind) + 1, low , mid, seg,ch);
		build((2 * ind) + 2, mid  + 1, high, seg,ch);
		Node left = seg[(2 * ind) + 1];
		Node right = seg[(2 * ind) + 2];
		int f = Math.min(left.open, right.close);
	    int curropen=  left.open - f + right.open;
	    int currclose = right.close - f + left.close;
	    int currfull = left.full + right.full + f;
	    seg[ind] = new Node(curropen,currclose,currfull);
	    
	}
	
	public static Node query(int ind , int low , int high ,Node seg [],int l, int r) {
		if(high < l || low > r) return new Node();
		if(low >= l && high <= r) return seg[ind];
		int mid = (low + high)/2;
		Node left = query((2 * ind) + 1 , low , mid, seg,l,r);
	   Node right = query((2 * ind) + 2 , mid +1, high, seg,l,r);
	   int f = Math.min(left.open, right.close);
	    int curropen=  left.open - f + right.open;
	    int currclose = right.close - f + left.close;
	    int currfull = left.full + right.full + f;
	   return  new Node(curropen,currclose,currfull);
	}
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char ch [] = s.toCharArray();
		Node seg [] = new Node[4 * ch.length];
		build(0,0,ch.length - 1,seg,ch);
		int q = Integer.parseInt(br.readLine());
		while(q -- > 0) {
			String qry = br.readLine();
			String a [] = qry.split(" ");
			int l = Integer.parseInt(a[0]);
			int r = Integer.parseInt(a[1]);
			l--;
			r--;
			Node ans = query(0,0,ch.length - 1,seg,l,r);
			System.out.println(ans.full*2);
			
		}
		br.close();

	}

}
