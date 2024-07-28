import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the number of integers
            int N = sc.nextInt();
            sc.nextLine(); // consume the newline character

            // Read the integers
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line);

            // Initialize min and max with extreme values
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            // Process each integer
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            // Print the result for this test case
            System.out.println(min + " " + max);
        }

        sc.close();
    }
}
