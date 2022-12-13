import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            int price = Integer.parseInt(br.readLine());
            if (price >= 25) {
                quarter = price / 25;
                price = price % 25;
            }
            if (price >= 10) {
                dime = price / 10;
                price = price % 10;
            }
            if (price >= 5) {
                nickel = price / 5;
                price = price % 5;
            }
            penny = price / 1;

            bw.write(String.valueOf(quarter) + " " + String.valueOf(dime) + " " + String.valueOf(nickel) + " "
                    + String.valueOf(penny) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}