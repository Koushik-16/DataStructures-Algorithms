package inputOutput;
import java.io.*;

public class Buffer {

	public static void main(String[] args)throws IOException {

		int a , b, sum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		sum = a + b;
		System.out.println(sum);
	}

}
