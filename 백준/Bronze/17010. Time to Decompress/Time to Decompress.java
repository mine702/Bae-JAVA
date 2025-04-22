import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = Integer.parseInt(sc.nextLine()); // 메시지 줄 수 입력
        
        for (int i = 0; i < L; i++) {
            String line = sc.nextLine();
            // 공백 기준으로 숫자와 문자 분리
            String[] parts = line.split(" ");
            int count = Integer.parseInt(parts[0]);
            char symbol = parts[1].charAt(0);

            // 문자 N번 반복 출력
            for (int j = 0; j < count; j++) {
                System.out.print(symbol);
            }
            System.out.println(); // 줄바꿈
        }

        sc.close();
    }
}
