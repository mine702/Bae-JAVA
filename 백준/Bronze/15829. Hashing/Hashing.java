import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String S = br.readLine();
        BigInteger result = new BigInteger("0");
        for (int i = 0; i < L; i++) {
            result = result.add(BigInteger.valueOf(S.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        bw.write(String.valueOf(result.remainder(BigInteger.valueOf(1234567891))));
        br.close();
        bw.flush();
        bw.close();
    }

}