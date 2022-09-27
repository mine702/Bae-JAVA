import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> ATM = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ATM.add(Integer.parseInt(st.nextToken()));
        }
        bw.write(String.valueOf(gride(ATM)));
        br.close();
        bw.flush();
        bw.close();
    }

    public static int gride(ArrayList<Integer> ATM) {
        int time = 0;
        int sum = 0;
        Collections.sort(ATM);
        for (int i = 0; i < ATM.size(); i++) {
            sum += ATM.get(i);
            time += sum;
        }
        return time;
    }
}