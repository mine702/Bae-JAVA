import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        char[] pattern = {'K', 'O', 'R', 'E', 'A'};
        int expect = 0; // 0:K, 1:O, 2:R, 3:E, 4:A
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == pattern[expect]) {
                cnt++;
                expect = (expect + 1) % 5;
            }
        }

        System.out.println(cnt);
    }
}
