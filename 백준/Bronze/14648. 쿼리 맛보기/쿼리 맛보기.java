import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열 길이
        int q = sc.nextInt(); // 쿼리 개수

        int[] arr = new int[n + 1]; // 1-based index 사용

        // 수열 입력
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // 쿼리 처리
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                long sum = 0;
                for (int j = a; j <= b; j++) {
                    sum += arr[j];
                }
                System.out.println(sum);

                // 스왑
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;

            } else if (type == 2) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                long sum1 = 0, sum2 = 0;
                for (int j = a; j <= b; j++) {
                    sum1 += arr[j];
                }
                for (int j = c; j <= d; j++) {
                    sum2 += arr[j];
                }
                System.out.println(sum1 - sum2);
            }
        }

        sc.close();
    }
}
