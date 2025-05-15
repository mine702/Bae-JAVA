import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N, M;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 총 책 수
        M = Integer.parseInt(st.nextToken()); // 더미 수

        boolean possible = true;

        for (int i = 0; i < M; i++) {
            int k = Integer.parseInt(br.readLine()); // 더미에 쌓인 책 수
            int[] books = new int[k];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                books[j] = Integer.parseInt(st.nextToken());
            }

            // 위에서 아래로 내려가면서 오름차순이 나오면 불가능
            for (int j = 0; j < k - 1; j++) {
                if (books[j] < books[j + 1]) {
                    possible = false;
                    break;
                }
            }
        }

        System.out.println(possible ? "Yes" : "No");
    }
}
