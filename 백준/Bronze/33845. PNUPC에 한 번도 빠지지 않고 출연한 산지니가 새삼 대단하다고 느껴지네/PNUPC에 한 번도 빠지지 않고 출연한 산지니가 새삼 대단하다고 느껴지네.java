import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); // 산지니의 아이디
        String T = sc.nextLine(); // 출력할 문자열

        HashSet<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            set.add(c); // 아이디에 포함된 문자 저장
        }

        StringBuilder result = new StringBuilder();
        for (char c : T.toCharArray()) {
            if (!set.contains(c)) {
                result.append(c); // 아이디에 포함되지 않은 문자만 추가
            }
        }

        System.out.println(result.toString());
    }
}
