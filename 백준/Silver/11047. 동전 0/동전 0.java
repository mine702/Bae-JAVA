import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        ArrayList<Integer> tokken = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            tokken.add(Integer.parseInt(br.readLine()));
        }
        bw.write(String.valueOf(gride(tokken, sum)));
        br.close();
        bw.flush();
        bw.close();
    }

    public static int gride(ArrayList<Integer> tokken, int sum) {
        int count = 0;
        Collections.sort(tokken, Collections.reverseOrder());
        for (int i = 0; i < tokken.size(); i++) {
            if (tokken.get(i) <= sum) {
                count += (sum / tokken.get(i));
                sum = sum % tokken.get(i);
            }
        }
        return count;
    }
}