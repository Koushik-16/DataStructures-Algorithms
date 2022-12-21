package recursion;

public class TowerOfHanoi {

	public static void toh(int n ,char tow1,char tow2, char tow3) {
		//move disks from tow1 to tow2 using tow3
		if(n == 0) return;
		toh(n-1,tow1,tow3,tow2);
		System.out.println(n + " ["+tow1 +" -> " +tow2+"]");
		toh(n-1,tow3,tow2,tow1);
	}
	public static void main(String []args) {
		int n = 3;
		toh(n,'A','B','C');
	}
	
}
