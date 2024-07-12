import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 값 받기
        int N = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        int scoreD = 0;  // 달구의 점수
        int scoreP = 0;  // 포닉스의 점수

        // 라운드 결과 처리
        for (int i = 0; i < N; i++) {
            char winner = scanner.nextLine().charAt(0);

            if (winner == 'D') {
                scoreD++;
            } else if (winner == 'P') {
                scoreP++;
            }

            // 2점 차이가 나면 경기를 종료
            if (Math.abs(scoreD - scoreP) >= 2) {
                break;
            }
        }

        // 결과 출력
        System.out.println(scoreD + ":" + scoreP);

        scanner.close();
    }
}
