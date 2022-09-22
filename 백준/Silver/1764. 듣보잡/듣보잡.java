import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> member = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        ArrayList<String> stranger = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            member.put(br.readLine(), i);
        }
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            int include = member.getOrDefault(name, 0);
            if (include != 0) {
                count++;
                stranger.add(name);
            }
        }
        bw.write(String.valueOf(count) + "\n");
        Collections.sort(stranger);
        for (int i = 0; i < stranger.size(); i++) {
            bw.write(stranger.get(i) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}