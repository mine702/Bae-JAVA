import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int bread = a / 2;
        int peet = b;
        if (bread > peet) {
            bw.write(String.valueOf(peet));
        } else {
            bw.write(String.valueOf(bread));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}