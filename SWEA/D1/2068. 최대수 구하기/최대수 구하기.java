import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i < T + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int max = 0;
            for (int j = 0; j < 10; j++) {
                int a = Integer.parseInt(st.nextToken());
                if(max < a){
                    max = a;
                }
            }
            sb.append("#" + i + " " + max + "\n");
        }

        System.out.println(sb);
    }
}
