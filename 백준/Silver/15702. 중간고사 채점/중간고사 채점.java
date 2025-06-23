import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] scores = new int[N];

        st = new StringTokenizer(br.readLine());

        int maxScore = -1;
        int num = 0;

        for(int i = 0; i < N; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i <= M; i++){
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int scode = Integer.parseInt(st.nextToken());
            
            for(int j = 0 ; j < N; j++){
                if(st.nextToken().equals("O")){
                    sum += scores[j];
                }
            }

            if(maxScore < sum){
                maxScore = sum;
                num = scode;
            }
            else if(maxScore == sum){
                if(num > scode)
                    num = scode;
            }
        }

        sb.append(num + " " + maxScore);
        System.out.println(sb);
    }
}
