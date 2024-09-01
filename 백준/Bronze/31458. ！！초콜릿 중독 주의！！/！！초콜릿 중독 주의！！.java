import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String exp = br.readLine();
            int left = 0, right = 0;

            while (left < exp.length() && exp.charAt(left) == '!') {
                left++;
            }

            right = exp.length() - left - 1;

            int n = exp.charAt(left) - '0';

            if (right > 0) {
                n = 1;
            }

            System.out.println((n + left) % 2);
        }
    }
}
