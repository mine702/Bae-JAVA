import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // StringBuilder를 사용하여 결과를 구성
        StringBuilder sb = new StringBuilder();
        
        int number = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (j > 0) {
                    sb.append(" ");  // 숫자 사이에 공백 추가
                }
                sb.append(number);
                number++;
            }
            sb.append("\n");  // 줄 바꿈
        }
        
        // 결과를 한 번에 출력
        System.out.print(sb.toString());
        
        scanner.close();
    }
}
