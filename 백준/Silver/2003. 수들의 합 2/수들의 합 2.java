import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        token = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        int cnt = 0;
        int start = 0;
        int end = 0;

        int sum = 0;
        sum += arr[0];
        while(true){
            try {
                if (sum == M) {
                    cnt++;
                    sum = sum + arr[++end] - arr[start++];
                } else if (sum < M) {
                    sum += arr[++end];
                } else {
                    sum -= arr[start];
                    start++;
                }

            } catch (Exception e) {
                break;
            }
        }            
        System.out.println(cnt);
    }
}