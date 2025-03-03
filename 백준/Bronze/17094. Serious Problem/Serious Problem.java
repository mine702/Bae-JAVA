import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 문자열 길이 입력
        String s = scanner.next(); // 문자열 입력
        scanner.close();
        
        int count2 = 0, countE = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '2') {
                count2++;
            } else if (c == 'e') {
                countE++;
            }
        }
        
        if (count2 > countE) {
            System.out.println("2");
        } else if (countE > count2) {
            System.out.println("e");
        } else {
            System.out.println("yee");
        }
    }
}
