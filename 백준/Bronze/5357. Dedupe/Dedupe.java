import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // 데이터 셋 개수
        
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            System.out.println(removeConsecutiveDuplicates(input));
        }
        
        scanner.close();
    }

    private static String removeConsecutiveDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        char prev = '\0'; // 이전 문자 저장 변수
        
        for (char c : str.toCharArray()) {
            if (c != prev) {
                result.append(c);
                prev = c;
            }
        }
        
        return result.toString();
    }
}
