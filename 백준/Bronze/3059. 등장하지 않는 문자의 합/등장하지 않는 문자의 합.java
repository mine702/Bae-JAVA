import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 전체 알파벳 ASCII 값의 합을 미리 계산
        int totalAsciiSum = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            totalAsciiSum += (int) ch;
        }
        
        // 테스트 데이터 수
        int T = sc.nextInt();
        sc.nextLine();  // 줄바꿈 문자 소비
        
        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            String S = sc.nextLine();
            HashSet<Character> presentChars = new HashSet<>();
            
            // 문자열 S의 각 문자 추적
            for (char ch : S.toCharArray()) {
                presentChars.add(ch);
            }
            
            // 등장하지 않는 알파벳의 ASCII 값 합산
            int missingAsciiSum = 0;
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                if (!presentChars.contains(ch)) {
                    missingAsciiSum += (int) ch;
                }
            }
            
            // 결과 출력
            System.out.println(missingAsciiSum);
        }
        
        sc.close();
    }
}
