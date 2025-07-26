import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int countO = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'O') {
                countO++;
            }
        }

        // 절반 이상 입력했는지 판정
        if (countO * 2 >= N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
