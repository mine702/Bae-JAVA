import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        int h = 0, i = 0, a = 0, r = 0, c = 0;

        for (int idx = 0; idx < N; idx++) {
            char ch = S.charAt(idx);
            switch (ch) {
                case 'H': h++; break;
                case 'I': i++; break;
                case 'A': a++; break;
                case 'R': r++; break;
                case 'C': c++; break;
            }
        }

        // 각 문자별 개수 중 최솟값이 만들 수 있는 이모지 수
        int min = Math.min(h, Math.min(i, Math.min(a, Math.min(r, c))));
        System.out.println(min);
    }
}
