import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        sb.append(numbers[1]);
        System.out.println(sb);
        br.close();
    }
}