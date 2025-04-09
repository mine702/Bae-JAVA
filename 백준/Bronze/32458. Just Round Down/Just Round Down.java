import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // 입력은 15바이트 이하의 문자열
        double x = Double.parseDouble(input); // 문자열을 실수로 변환
        int result = (int)Math.floor(x); // 내림 처리 후 정수로 캐스팅
        System.out.println(result);
    }
}
