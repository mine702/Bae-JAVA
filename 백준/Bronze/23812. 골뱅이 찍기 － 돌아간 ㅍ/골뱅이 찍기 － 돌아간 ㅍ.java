import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalRows = N * 5;
        int totalCols = N * 5;

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                // 조건에 따라 @ 또는 공백 출력
                if (
                    (i < N && j < N) || // 좌측 상단
                    (i < N && j >= 4 * N) || // 우측 상단
                    (i >= N && i < 2 * N) || // 첫 번째 가로줄
                    (i >= 2 * N && i < 3 * N && (j < N || j >= 4 * N)) || // 가운데 세로줄 좌우
                    (i >= 3 * N && i < 4 * N) || // 두 번째 가로줄
                    (i >= 4 * N && j < N) || // 좌측 하단
                    (i >= 4 * N && j >= 4 * N) // 우측 하단
                ) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
