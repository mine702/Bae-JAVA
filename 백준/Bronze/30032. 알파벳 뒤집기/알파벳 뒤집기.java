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
        int D = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                char ch = str.charAt(j);
                switch (ch) {
                    case 'd':
                        if (D == 1)
                            sb.append('q');
                        else
                            sb.append('b');
                        break;
                    case 'b':
                        if (D == 1)
                            sb.append('p');
                        else
                            sb.append('d');
                        break;
                    case 'q':
                        if (D == 1)
                            sb.append('d');
                        else
                            sb.append('p');
                        break;
                    case 'p':
                        if (D == 1)
                            sb.append('b');
                        else
                            sb.append('q');
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}