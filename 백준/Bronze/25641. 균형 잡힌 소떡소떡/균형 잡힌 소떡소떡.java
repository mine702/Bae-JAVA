import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 사용은 안 되지만 필요 조건
        String s = br.readLine();

        int sCount = 0;
        int tCount = 0;

        // 전체 s와 t 개수 세기
        for (char c : s.toCharArray()) {
            if (c == 's') sCount++;
            else if (c == 't') tCount++;
        }

        // 왼쪽에서부터 줄여나가기
        for (int i = 0; i < s.length(); i++) {
            if (sCount == tCount) {
                bw.write(s.substring(i));
                bw.newLine();
                break;
            }

            if (s.charAt(i) == 's') sCount--;
            else if (s.charAt(i) == 't') tCount--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
