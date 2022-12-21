package questions;

import java.util.ArrayList;

public class LengthOfLIS {
	
	public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1; i < nums.length ;i++){
            int lastItem = list.get(list.size() - 1);
            if(lastItem  < nums[i]){
              list.add(nums[i]);
            }else {
                int index = nextGraterItem(list,nums[i]);
                list.set(index,nums[i]);
            }
        }
        return list.size();
    }
    
    public static int nextGraterItem(ArrayList<Integer> list, int ele){
        int low = 0;
        int high = list.size() - 1;
        while(low  < high){
            int mid = (low + high)/ 2;
            if(list.get(mid) < ele) low = mid + 1;
            else high = mid;
            
}
        return low;
}

	public static void main(String[] args) {
		

	}

}
