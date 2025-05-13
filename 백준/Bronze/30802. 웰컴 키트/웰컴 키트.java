import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[6];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (T >= nums[i]) {
                if (nums[i] != 0)
                    tCount++;
            } else {
                tCount += nums[i] / T;
                if (nums[i] % T != 0)
                    tCount++;
            }
        }

        sb.append(tCount + "\n").append(N / P + " " + N % P);
        System.out.println(sb);
    }
}