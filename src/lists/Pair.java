package lists;
import java.util.*;

public class Pair<X, Y> {
	
	X x;
	Y y;
	
	public Pair(X x,Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " and " + y);
		List<String> ans = new ArrayList<>();
		Collections.reverse(ans);
	}

}
