import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> nin = new HashSet<>();
        int count = 0;
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        for (int i = 0; i < n; i++) {
            String nickname = br.readLine();
            nin.add(nickname);
        }
        switch (game) {
            case "Y":
                for (int i = 0; i < nin.size(); i++) {
                    count++;
                }
                break;
            case "F":
                for (int i = 0; i < nin.size() / 2; i++) {
                    count++;
                }
                break;
            case "O":
                for (int i = 0; i < nin.size() / 3; i++) {
                    count++;
                }
                break;
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }
}
