import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 학생 수
        int[][] answers = new int[N][10];

        // 정답 패턴: ((j - 1) % 5) + 1
        int[] correctPattern = new int[10];
        for (int i = 0; i < 10; i++) {
            correctPattern[i] = (i % 5) + 1;
        }

        // 답안 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                answers[i][j] = sc.nextInt();
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            boolean isPerfect = true;
            for (int j = 0; j < 10; j++) {
                if (answers[i][j] != correctPattern[j]) {
                    isPerfect = false;
                    break;
                }
            }
            if (isPerfect) {
                // 문제에서 학생 번호는 1부터 시작한다고 했으므로 i+1 출력
                System.out.println(i + 1);
            }
        }
    }
}
