import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 용의자의 수 입력
        int N = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        
        // 용의자의 이름 배열 선언
        String[] suspects = new String[N];
        
        // 용의자의 이름 입력
        for (int i = 0; i < N; i++) {
            suspects[i] = scanner.nextLine();
        }
        
        // 범인의 이름 찾기
        String culprit = "";
        for (int i = 0; i < N; i++) {
            if (suspects[i].contains("S")) {
                culprit = suspects[i];
                break;
            }
        }
        
        // 범인의 이름 출력
        System.out.println(culprit);
        
        scanner.close();
    }
}
