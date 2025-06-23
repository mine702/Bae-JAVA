import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> li = new PriorityQueue<Integer>(Collections.reverseOrder());
        for( int i = 0 ; i < N; i++ ){
            li.add(Integer.parseInt(br.readLine()));
        }
        for( int i = 0 ; i < N; i++ ){
            sb.append(li.poll() + "\n");
        }
        System.out.println(sb);
    }
}
