import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int num = arr[A - 1][B - 1];

        for (int i = 0; i < N; i++) {
            int a = arr[A - 1][i];
            int b = arr[i][B - 1];

            if (num < a || num < b) {
                num = -1;
                break;
            }
        }

        if (num == -1)
            sb.append("ANGRY");
        else
            sb.append("HAPPY");
        System.out.println(sb);
    }
}