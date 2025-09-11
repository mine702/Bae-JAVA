import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        String s = br.readLine();
        while (s != null && s.isEmpty()) s = br.readLine(); // 빈 줄 방지(예외적 입력 대비)

        int ans = 0;
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i) != s.charAt(N - 1 - i)) ans++;
        }

        System.out.println(ans);
    }
}
