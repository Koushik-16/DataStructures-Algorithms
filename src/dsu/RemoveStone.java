package dsu;

import java.util.HashMap;

public class RemoveStone {
	
	 HashMap<String,String> map ;
	    int count;
	    public int removeStones(int[][] stones) {
	        map = new HashMap<>();
	       int n = count = stones.length;
	        for(int stone [] : stones){
	            String s = stone[0] + " " + stone[1];
	            map.put(s,s);
	        }
	        
	        for(int s1 [] : stones){
	            String c1 = s1[0] + " " + s1[1];
	            for(int s2 [] : stones){
	                if(s1[0] == s2[0] || s1[1] == s2[1]){
	                    String c2 = s2[0] + " " + s2[1];
	                    union(c1,c2);
	                }
	            }
	        }
	        
	        return n - count;
	        
	    }
	    
	    public void union(String s1 , String s2){
	        String p1 = find(s1);
	        String p2 = find(s2);
	        if(p1.equals(p2)) return ;
	        map.put(p1,p2);
	        count--;
	    }
	    
	    public String find(String s){
	        if(s.equals(map.get(s))) return s;
	        else {
	            map.put(s,find(map.get(s)));
	            return map.get(s);
	        }
	    }

	public static void main(String[] args) {

	}

}
