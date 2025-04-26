import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트 케이스 개수
        sc.nextLine(); // 개행 문자 소비

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                left++;
                right--;
            }

            // 마지막에 남은 두 문자 비교
            if (s.charAt(left) == s.charAt(right)) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }
    }
}
