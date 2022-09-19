import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[Integer.parseInt(st.nextToken())];
        int answer = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        play(numbers, answer);
        br.close();
        bw.flush();
        bw.close();
    }

    public static void play(int[] numbers, int answer) throws IOException {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    hs.add(numbers[i] + numbers[j] + numbers[k]);
                }
            }
        }
        Integer[] arr = hs.toArray(new Integer[0]);
        int[] sum = new int[arr.length];
        int big = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= answer) {
                sum[t++] = arr[i];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            if (i == 0) {
                big = sum[i];
            } else if (big < sum[i]) {
                big = sum[i];
            }
        }
        bw.write(String.valueOf(big));
    }
}