import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {           
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int result = greedy(numbers);
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }

    public static int greedy(int[] numbers) {
        int count = 0;
        int order = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == order) {
                order++;
            } else {
                count++;
            }
        }
        return count;
    }
}