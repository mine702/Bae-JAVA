import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 조사 시간
        int m = sc.nextInt(); // 초기 차량 수
        int max = m;

        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();  // 입구 차량 수
            int out = sc.nextInt(); // 출구 차량 수

            m = m + in - out;

            if (m < 0) {
                System.out.println(0);
                return;
            }

            if (m > max) {
                max = m;
            }
        }

        System.out.println(max);
    }
}
