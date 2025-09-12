import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        String easiestTitle = null;
        int minDifficulty = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            int difficulty = Integer.parseInt(st.nextToken());

            if (difficulty < minDifficulty) {
                minDifficulty = difficulty;
                easiestTitle = title;
            }
        }

        System.out.print(easiestTitle);
    }
}
