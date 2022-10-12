import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        if (numbers[0] + numbers[1] == numbers[2]) {
            bw.write("1");
        } else if (numbers[0] * numbers[1] == numbers[2]) {
            bw.write("2");
        } else {
            bw.write("3");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}