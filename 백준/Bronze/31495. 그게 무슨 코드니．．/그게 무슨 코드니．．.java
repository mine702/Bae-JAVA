import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        // 문자열의 시작과 끝이 큰따옴표로 이루어져 있는지 확인
        if (input.length() >= 2 && input.startsWith("\"") && input.endsWith("\"")) {
            // 큰따옴표 내부의 문자열을 추출
            String innerString = input.substring(1, input.length() - 1);
            // 내부 문자열이 빈 문자열인지 확인
            if (innerString.length() > 0) {
                System.out.println(innerString);
            } else {
                System.out.println("CE");
            }
        } else {
            System.out.println("CE");
        }
    }
}
