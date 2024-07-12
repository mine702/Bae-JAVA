import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 N 값을 입력 받음
        int N = scanner.nextInt();

        // 문제를 푼 횟수를 저장하는 배열 선언 및 입력 받음
        int[] problems = new int[N];
        for (int i = 0; i < N; i++) {
            problems[i] = scanner.nextInt();
        }

        scanner.close();

        // 최장 스트릭을 계산하는 변수들
        int maxStreak = 0;
        int currentStreak = 0;

        // 스트릭을 계산
        for (int i = 0; i < N; i++) {
            if (problems[i] > 0) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        // 최장 스트릭 출력
        System.out.println(maxStreak);
    }
}
