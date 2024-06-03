import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 무기의 수 N
        int N = scanner.nextInt();
        // 산지니 4인조가 가진 돈 X와 후안의 공격력 S
        long X = scanner.nextLong();
        long S = scanner.nextLong();

        boolean canAdventure = false;

        for (int i = 0; i < N; i++) {
            // 무기의 가격 c와 공격력 p
            long c = scanner.nextLong();
            long p = scanner.nextLong();

            // 무기가 가격보다 작거나 같고 공격력이 후안의 공격력보다 크다면 모험을 떠날 수 있다.
            if (c <= X && p > S) {
                canAdventure = true;
                break;
            }
        }

        // 결과 출력
        if (canAdventure) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
