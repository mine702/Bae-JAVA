import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Integer[] numbers = new Integer[10];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(numbers, Collections.reverseOrder());
            sb.append(numbers[2] + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}