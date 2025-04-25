import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N * 5; i++) {
            if (i < N) {
                // 출력 1: @@@ + 공백 + @
                sb.append(repeatChar('@', N * 3));
                sb.append(repeatChar(' ', N));
                sb.append(repeatChar('@', N));
            } else if (i >= N && i < N * 5 - N) {
                // 출력 2: @ + 공백 + @ + 공백 + @
                sb.append(repeatChar('@', N));
                sb.append(repeatChar(' ', N));
                sb.append(repeatChar('@', N));
                sb.append(repeatChar(' ', N));
                sb.append(repeatChar('@', N));
            } else {
                // 출력 3: @ + 공백 + @@@
                sb.append(repeatChar('@', N));
                sb.append(repeatChar(' ', N));
                sb.append(repeatChar('@', N * 3));
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    // 문자열 반복 함수
    private static String repeatChar(char c, int count) {
        return String.valueOf(c).repeat(count);
    }
}
