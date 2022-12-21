package recursion2;

public class HouseRobber2 {
	
	public static long houseRobber(int[] valueInHouse) {
        if(valueInHouse.length == 1) return valueInHouse[0];
	     long ans1 = exceptFirst(valueInHouse);
        long ans2 = exceptLast(valueInHouse) ;
        return Math.max(ans1,ans2);      
	}
    public static long exceptFirst(int [] valueInHouse){
        long iplush1 = 0;
        long iplush2 = 0;
            for(int i = valueInHouse.length - 1 ; i > 0 ; i--){
                long fs = valueInHouse[i] + iplush2;
                long ss = iplush1;
                long curi = Math.max(fs,ss);
                iplush2 = iplush1;
                iplush1 = curi;
            }
        return iplush1;
        
    }
     public static long exceptLast(int [] valueInHouse){
         long iplush1 = 0;
        long iplush2 = 0;
            for(int i = valueInHouse.length - 2 ; i >=0 ; i--){
                long fs = valueInHouse[i] + iplush2;
                long ss = iplush1;
                long curi = Math.max(fs,ss);
                iplush2 = iplush1;
                iplush1 = curi;
            }
        return iplush1;
    }

	public static void main(String[] args) {
		

	}

}
