import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 후보자 수

        for (int i = 0; i < T; i++) {
            int votes = sc.nextInt(); // 각 후보자가 받은 표 수

            int fullGroups = votes / 5; // 5표씩 모은 ++++ 그룹 수
            int remainder = votes % 5;  // 남은 표 수 (1~4개)

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < fullGroups; j++) {
                result.append("++++ ");
            }

            for (int j = 0; j < remainder; j++) {
                result.append("|");
            }

            // 출력 결과를 trim해서 맨 끝 공백 제거
            System.out.println(result.toString().trim());
        }

        sc.close();
    }
}
