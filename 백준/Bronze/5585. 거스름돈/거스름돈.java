import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int change = 1000 - N;
        int result = 0;
        if (change >= 500) {
            result = (change / 500) + result;
            change = change % 500;
        }
        if (change >= 100) {
            result = (change / 100) + result;
            change = change % 100;
        }
        if (change >= 50) {
            result = (change / 50) + result;
            change = change % 50;
        }
        if (change >= 10) {
            result = (change / 10) + result;
            change = change % 10;
        }
        if (change >= 5) {
            result = (change / 5) + result;
            change = change % 5;
        }
        result = change + result;
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}