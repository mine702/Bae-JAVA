import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(factorial(A) / (factorial(A - B) * factorial(B)));
        br.close();
        bw.flush();
        bw.close();
    }

    public static int factorial(int N) {
		if (N <= 1)	{
			return 1;
		}
		return N * factorial(N - 1);
	}
}