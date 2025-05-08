import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 묶음 개수
        int K = sc.nextInt(); // 묶음당 빵 개수
        int P = sc.nextInt(); // 허용되는 크림 없는 빵의 최대 수

        int[] breads = new int[N * K];
        for (int i = 0; i < N * K; i++) {
            breads[i] = sc.nextInt();
        }

        int count = 0; // 팔 수 있는 묶음 개수

        for (int i = 0; i < N; i++) {
            int start = i * K;
            int creamless = 0;

            for (int j = start; j < start + K; j++) {
                if (breads[j] == 0) {
                    creamless++;
                }
            }

            if (creamless < P) {
                count++;
            }
        }

        System.out.println(count);
    }
}
