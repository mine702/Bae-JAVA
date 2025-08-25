import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // n (사용하지 않아도 됨)
        String s = br.readLine().trim();

        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }

        int ans = Integer.MAX_VALUE;
        String target = "uospc";
        for (int i = 0; i < target.length(); i++) {
            ans = Math.min(ans, cnt[target.charAt(i) - 'a']);
        }

        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
    }
}
