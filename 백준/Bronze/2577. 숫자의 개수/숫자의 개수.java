import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] number = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = String.valueOf(A * B * C);
        for (int i = 0; i < result.length(); i++) {
            int num = Character.getNumericValue(result.charAt(i));
            for (int j = 0; j < number.length; j++) {
                if (j == num) {
                    number[j]++;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            bw.write(String.valueOf(number[i]) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}