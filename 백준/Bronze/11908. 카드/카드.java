import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] cards = new int[n];
        int sum = 0;
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
            sum += cards[i];
            if (cards[i] > max) {
                max = cards[i];
            }
        }
        
        System.out.println(sum - max);
    }
}
