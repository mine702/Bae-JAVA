import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // 입력 문자열
        String target = "SciComLove"; // 민규가 좋아하는 문자열
        int diffCount = 0;

        for (int i = 0; i < 10; i++) {
            if (input.charAt(i) != target.charAt(i)) {
                diffCount++;
            }
        }

        System.out.println(diffCount);
    }
}
