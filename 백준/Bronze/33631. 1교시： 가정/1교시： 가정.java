import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 초기 재료의 양
        int F_s = sc.nextInt();
        int C_s = sc.nextInt();
        int E_s = sc.nextInt();
        int B_s = sc.nextInt();

        // 쿠키 1개 만드는 데 필요한 재료의 양
        int F_n = sc.nextInt();
        int C_n = sc.nextInt();
        int E_n = sc.nextInt();
        int B_n = sc.nextInt();

        // 만들어진 쿠키의 수
        int cookiesMade = 0;

        // 쿼리의 개수
        int Q = sc.nextInt();

        // 쿼리 처리
        for (int i = 0; i < Q; i++) {
            int queryType = sc.nextInt();
            int amount = sc.nextInt();

            if (queryType == 1) {
                // 쿠키를 만들 수 있는지 확인
                int maxCookies = Math.min(F_s / F_n, Math.min(C_s / C_n, Math.min(E_s / E_n, B_s / B_n)));
                if (amount <= maxCookies) {
                    F_s -= F_n * amount;
                    C_s -= C_n * amount;
                    E_s -= E_n * amount;
                    B_s -= B_n * amount;
                    cookiesMade += amount;
                    System.out.println(cookiesMade);
                } else {
                    System.out.println("Hello, siumii");
                }
            } else if (queryType == 2) {
                // 밀가루 추가
                F_s += amount;
                System.out.println(F_s);
            } else if (queryType == 3) {
                // 초콜릿 추가
                C_s += amount;
                System.out.println(C_s);
            } else if (queryType == 4) {
                // 달걀 추가
                E_s += amount;
                System.out.println(E_s);
            } else if (queryType == 5) {
                // 버터 추가
                B_s += amount;
                System.out.println(B_s);
            }
        }

        sc.close();
    }
}
