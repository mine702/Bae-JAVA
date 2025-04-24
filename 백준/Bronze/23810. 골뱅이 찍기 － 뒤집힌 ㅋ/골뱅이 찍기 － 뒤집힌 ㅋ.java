import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String fullRow = "@".repeat(N * 5);  // 가장 긴 가로 줄
        String shortRow = "@".repeat(N);     // 짧은 세로 줄

        // 첫 번째 가로줄 N번 출력
        for (int i = 0; i < N; i++) {
            System.out.println(fullRow);
        }

        // 첫 번째 세로줄 N번 출력
        for (int i = 0; i < N; i++) {
            System.out.println(shortRow);
        }

        // 두 번째 가로줄 N번 출력
        for (int i = 0; i < N; i++) {
            System.out.println(fullRow);
        }

        // 두 번째 세로줄 N번 출력
        for (int i = 0; i < N; i++) {
            System.out.println(shortRow);
        }

        // 세 번째 세로줄 N번 출력
        for (int i = 0; i < N; i++) {
            System.out.println(shortRow);
        }

        sc.close();
    }
}
