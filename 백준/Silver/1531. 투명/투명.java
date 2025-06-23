import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int nums[][] = new int[101][101];

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for( int j = y1 ; j <= y2; j++ ){
                for( int k = x1; k <= x2; k++ ){
                    nums[j][k]++;
                }
            }
        }

        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j < nums[i].length; j++){
                if(nums[i][j] > M)
                    count++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
