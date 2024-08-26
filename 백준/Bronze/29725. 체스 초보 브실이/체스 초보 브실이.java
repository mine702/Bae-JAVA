import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 체스 기물 점수 정의
        int[] score = new int[128];
        score['P'] = 1;
        score['N'] = 3;
        score['B'] = 3;
        score['R'] = 5;
        score['Q'] = 9;
        score['p'] = -1;
        score['n'] = -3;
        score['b'] = -3;
        score['r'] = -5;
        score['q'] = -9;

        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;

        // 8x8 체스판을 입력받고 점수를 계산
        for (int i = 0; i < 8; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 8; j++) {
                char piece = line.charAt(j);
                totalScore += score[piece];
            }
        }

        // 최종 점수 출력
        System.out.println(totalScore);
    }
}
