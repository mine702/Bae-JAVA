import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력을 받는다
        int N = scanner.nextInt(); // 백준에서 해결한 문제 수
        int U = scanner.nextInt(); // 유니온 레벨
        int L = scanner.nextInt(); // 최고 레벨

        // 조건을 체크하고 결과를 출력한다
        if (N >= 1000) {
            if (U >= 8000 || L >= 260) {
                System.out.println("Very Good");
            } else {
                System.out.println("Good");
            }
        } else {
            System.out.println("Bad");
        }

        scanner.close();
    }
}
