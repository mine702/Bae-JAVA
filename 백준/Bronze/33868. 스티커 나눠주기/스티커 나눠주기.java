import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 제출 개수

        int maxTime = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();  // 제출 시간
            int B = sc.nextInt();  // 코드 길이

            if (T > maxTime) {
                maxTime = T;
            }

            if (B < minLength) {
                minLength = B;
            }
        }

        int product = maxTime * minLength;
        int remainder = product % 7;

        // 캐릭터 번호는 1부터 시작 (튜리=1, ..., 눈결이=7)
        int stickerNumber = remainder + 1;

        System.out.println(stickerNumber);
    }
}
