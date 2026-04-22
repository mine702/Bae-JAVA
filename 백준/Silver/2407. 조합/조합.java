import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static BigInteger[] dynamic;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        dynamic = new BigInteger[N + 1];
        dynamic[1] = BigInteger.ONE;
        for (int i = 2; i < dynamic.length; i++) {
            dynamic[i] = dynamic[i - 1].multiply(BigInteger.valueOf(i));
        }

        sb.append(dynamic[N].divide(dynamic[M].multiply(dynamic[N - M])));
        System.out.println(sb);
    }
}