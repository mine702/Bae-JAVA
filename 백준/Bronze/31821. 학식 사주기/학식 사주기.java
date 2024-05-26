import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 메뉴의 개수 입력 받기
        int N = scanner.nextInt();
        int[] menuPrices = new int[N];

        // 각 메뉴의 가격 입력 받기
        for (int i = 0; i < N; i++) {
            menuPrices[i] = scanner.nextInt();
        }

        // 새내기의 인원수 입력 받기
        int M = scanner.nextInt();
        int totalCost = 0;

        // 각 새내기가 원하는 메뉴의 코너 번호 입력 받아서 총 금액 계산
        for (int i = 0; i < M; i++) {
            int menuIndex = scanner.nextInt() - 1; // 코너 번호는 1부터 시작하므로 0-based index로 변환
            totalCost += menuPrices[menuIndex];
        }

        // 총 결제 금액 출력
        System.out.println(totalCost);

        scanner.close();
    }
}
