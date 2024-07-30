import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 세로로 N*5개의 셀을 출력
        for (int i = 0; i < N * 4; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        // 가로로 N*5개의 셀을 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N * 5; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        sc.close();
    }
}
