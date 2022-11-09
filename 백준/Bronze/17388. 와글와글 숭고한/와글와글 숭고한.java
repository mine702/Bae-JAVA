import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int sum = S + K + H;
        if (sum >= 100) {
            bw.write("OK");
        } else {
            int[] result = { S, K, H };
            Arrays.sort(result);
            int shortint = result[0];
            if(shortint == S){
                bw.write("Soongsil");
            }else if(shortint == K){
                bw.write("Korea");
            }else{
                bw.write("Hanyang");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
