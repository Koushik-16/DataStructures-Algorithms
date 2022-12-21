package arrays;
import java.util.Arrays;

public class Findmedian {
	
  public static int Findmedian(int[] v ) {
		Arrays.sort(v);
		if((v.length&1) == 0) {
			int ans = ( v[(v.length -1) / 2] + v[v.length / 2]) / 2;;
			return ans;
		} else {
			int x = v[(v.length -1) / 2];
			return x;
		}
	}
	public static void main(String[] args) {
		int [] a = {59, 61, 100, 80};
		System.out.println(Findmedian(a));
	}
}
