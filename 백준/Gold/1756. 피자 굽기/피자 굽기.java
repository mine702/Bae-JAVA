import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] oven = new int[D + 1];

        st = new StringTokenizer(br.readLine());
        int minRadius = Integer.MAX_VALUE;
        for (int i = 1; i <= D; i++) {
            int currentRadius = Integer.parseInt(st.nextToken());
            minRadius = Math.min(minRadius, currentRadius);
            oven[i] = minRadius;
        }

        int[] pizza = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            pizza[i] = Integer.parseInt(st.nextToken());
        }

        int position = D;
        for (int i = 0; i < N; i++) {
            boolean placed = false;
            for (int j = position; j > 0; j--) {
                if (oven[j] >= pizza[i]) {
                    position = j - 1;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                position = 0;
                break;
            }
        }

        sb.append(position > 0 ? position + 1 : 0); // 0부터가 아니라 1부터 시작하므로 +1

        System.out.println(sb);
    }
}
