import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.close();
        
        // 첫 번째 줄
        printGolbangLine(N + 2);
        
        // 중간 줄
        for (int i = 0; i < N; i++) {
            printMiddleLine(N);
        }
        
        // 마지막 줄
        printGolbangLine(N + 2);
    }
    
    // 골뱅이 문자를 N개 출력하는 함수
    private static void printGolbangLine(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("@");
        }
        System.out.println();
    }
    
    // 앞뒤로 골뱅이 문자 2개와 중간에 공백 N개를 출력하는 함수
    private static void printMiddleLine(int N) {
        System.out.print("@");
        for (int i = 0; i < N; i++) {
            System.out.print(" ");
        }
        System.out.print("@");
        System.out.println();
    }
}
