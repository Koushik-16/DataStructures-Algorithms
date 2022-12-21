package maps;

import java.util.HashMap;

public class PairWithGivenDifference {
	
	public int solve(int[] A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i =0 ; i < A.length ;i++) map.put(A[i],map.getOrDefault(A[i],0)+ 1);
       if(B == 0){
           for(int key : map.keySet()){
               if(map.get(key) >=2) return 1;
           }
           return 0;
       }
       for(int i = 0 ; i < A.length ; i++){
           if(map.containsKey(A[i] - B)) return 1;
       }
       return 0;
   }

	public static void main(String[] args) {
		

	}

}
