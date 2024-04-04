import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] nums = new int[101];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                nums[j]++;
            }
        }
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                switch (nums[i]) {
                    case 1:
                        sum += A;
                        break;
                    case 2:
                        sum += B*2;
                        break;
                    case 3:
                        sum += C*3;
                        break;
                }
            }
        }
        sb.append(sum);
        System.out.println(sb);
    }
}