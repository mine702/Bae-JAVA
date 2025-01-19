import java.io.*;
import java.util.*;

public class Main {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        while (m-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            switch (a) {
                case 1 :
                    arr[b] = c;
                    break;
                case 2 :
                    for (int i = b; i <= c; i++) arr[i]^=1;
                    break;
                case 3 :
                    for (int i = b; i <= c; i++) arr[i] = 0;
                    break;
                case 4 :
                    for (int i = b; i <= c; i++) arr[i] = 1;
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++)
            sb.append(arr[i]).append(' ');
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}