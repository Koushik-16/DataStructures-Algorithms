package arrays;

public class RotateImage {
	
	int [][] rotateImage(int[][]  mattrix) {
		
		int N = mattrix.length;
		for(int i = 0; i<N; i++) {
			for(int j = i; j<N; j++) {
				int temp = mattrix [i] [j];
				mattrix [i][j] = mattrix [j][i];
				 mattrix [j][i] = temp;
			}
		}
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<(N/2); j++ ) {
				int temp = mattrix[i][j];
				mattrix[i][j] = mattrix[i][N-1-j];
				mattrix[i][N-1-j] = temp;
			}
		}
		return mattrix;
	}
}
