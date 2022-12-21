package twoDArray;

public class Spiral2 {
	
	public static int[][] generateMatrix(int A) {
        int r1 = 0;
        int r2 = A-1;
        int c1 = 0;
        int c2 = A-1;
        int arr [][] = new int[A][A];
        int count = 1;
        while(r1 <= r2 && c1<=c2){
            for(int c = c1 ; c<=c2; c++) arr[r1][c] = count++;
            for(int r = r1 +1; r<=r2 ;r++) arr[r][c2] = count++;
            if(r1 < r2 && c1 <c2){
                for(int c = c2-1; c > c1 ;c --) arr[r2][c] = count++;
                for(int r = r2 ; r > r1; r--) arr[r][c1] = count++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return arr;
    }

	public static void main(String[] args) {
		

	}

}
