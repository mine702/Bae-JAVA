import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < N; j++) {
                switch (i) {
                    case 0:
                        sb.append("@".repeat(N) + "   ".repeat(N) + "@".repeat(N));
                        sb.append("\n");
                        break;
                    case 1:
                        sb.append("@".repeat(N) + "  ".repeat(N) + "@".repeat(N));
                        sb.append("\n");
                        break;
                    case 2:
                        sb.append("@@@".repeat(N));
                        sb.append("\n");
                        break;
                    case 3:
                        sb.append("@".repeat(N) + "  ".repeat(N) + "@".repeat(N));
                        sb.append("\n");
                        break;
                    case 4:
                        sb.append("@".repeat(N) + "   ".repeat(N) + "@".repeat(N));
                        sb.append("\n");
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(sb);
    }
}