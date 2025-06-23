import java.io.*;
import java.util.*;

public class Main {

    public static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        int current = 0;

        if( N > 0 ){
            st = new StringTokenizer(br.readLine());
            
            for(int i = 0 ; i < N; i++){
                int num = Integer.parseInt(st.nextToken());
                if(current + num > M){
                    count++;
                    current = num;
                }else{
                    current += num;
                }
            }
            sb.append(count + 1);
        }else{
            sb.append(0);
        }
        System.out.println(sb);
    }
}
