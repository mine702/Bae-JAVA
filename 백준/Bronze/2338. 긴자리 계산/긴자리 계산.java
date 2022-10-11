import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        bw.write(String.valueOf(a.add(b)) + "\n");
        bw.write(String.valueOf(a.subtract(b)) + "\n");
        bw.write(String.valueOf(a.multiply(b)) + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}