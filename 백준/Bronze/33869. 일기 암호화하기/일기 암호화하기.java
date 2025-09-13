import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String W = br.readLine().trim();
        String S = br.readLine().trim();

        boolean[] used = new boolean[26];
        StringBuilder key = new StringBuilder();

        // 1) 단어 키 만들기 (중복 제거, 처음 등장만 유지)
        for (char ch : W.toCharArray()) {
            int idx = ch - 'A';
            if (!used[idx]) {
                used[idx] = true;
                key.append(ch);
            }
        }

        // 2) 암호화 표(치환 문자열) 완성: 키 + 남은 알파벳
        StringBuilder cipher = new StringBuilder();
        cipher.append(key);
        for (char c = 'A'; c <= 'Z'; c++) {
            int idx = c - 'A';
            if (!used[idx]) {
                used[idx] = true;
                cipher.append(c);
            }
        }

        char[] map = cipher.toString().toCharArray(); // 평문 A~Z -> 암호문 치환표

        // 3) S를 암호화
        StringBuilder res = new StringBuilder();
        for (char ch : S.toCharArray()) {
            res.append(map[ch - 'A']);
        }

        System.out.print(res.toString());
    }
}
