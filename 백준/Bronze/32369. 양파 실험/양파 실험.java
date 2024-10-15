import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int union1 = 1;
        int union2 = 1;

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < N; i++){
            union1 = union1 + A;
            union2 = union2 + B;

            if(union1 < union2){
                int temp = union1;
                union1 = union2;
                union2 = temp;
            }else if(union1 == union2){
                union2--;
            }
        }

        sb.append(union1);
        sb.append(" ");
        sb.append(union2);

        System.out.println(sb);
    }
}
