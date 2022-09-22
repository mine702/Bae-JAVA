import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> AS = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            A.add(num);
            AS.add(num);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }
        A.removeAll(B);
        B.removeAll(AS);
        A.addAll(B);
        bw.write(String.valueOf(A.size()));        
        br.close();
        bw.flush();
        bw.close();
    }
}