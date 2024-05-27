import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력 받기
        String input = scanner.nextLine();
        
        // "D2" 또는 "d2"가 포함되어 있는지 확인
        if (input.contains("D2") || input.contains("d2")) {
            System.out.println("D2");
        } else {
            System.out.println("unrated");
        }
    }
}
