import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int[] buildLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;
        for (int i = 1; i < m; ) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }

    private static boolean kmpContains(String text, String pat) {
        int n = text.length(), m = pat.length();
        if (m == 0) return true;
        if (m > n) return false;

        int[] lps = buildLPS(pat);
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++; j++;
                if (j == m) return true;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String K = br.readLine();

        // 숫자를 제거하고 알파벳만 남김
        StringBuilder sb = new StringBuilder(S.length());
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c < '0' || c > '9') sb.append(c); // 알파벳만 추가
        }
        String filtered = sb.toString();

        System.out.print(kmpContains(filtered, K) ? 1 : 0);
    }
}
