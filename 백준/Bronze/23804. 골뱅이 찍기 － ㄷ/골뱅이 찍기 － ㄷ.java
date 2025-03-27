import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        // 윗부분 (가로 5N)
        for (int i = 0; i < N; i++) {
            printChars('@', 5 * N);
        }
        
        // 중간 부분 (세로 3N, 가로 N)
        for (int i = 0; i < 3 * N; i++) {
            printChars('@', N);
        }
        
        // 아랫부분 (가로 5N)
        for (int i = 0; i < N; i++) {
            printChars('@', 5 * N);
        }
    }
    
    // 특정 문자를 특정 개수만큼 출력하는 메서드
    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
