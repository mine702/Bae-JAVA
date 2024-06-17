import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 줄 입력 받기
        int N = scanner.nextInt(); // 문제 후보 수
        int M = scanner.nextInt(); // 출제위원 수 (항상 홀수)
        
        // 과반수 기준 계산
        int majority = M / 2 + 1;
        
        // 줄바꿈 문자 소비
        scanner.nextLine();
        
        int selectedCount = 0;
        
        // 각 문제 후보에 대한 찬반 의견 처리
        for (int i = 0; i < N; i++) {
            String votes = scanner.nextLine();
            int countO = 0;
            
            // 찬반 의견 세기
            for (char vote : votes.toCharArray()) {
                if (vote == 'O') {
                    countO++;
                }
            }
            
            // 과반수 찬성 여부 확인
            if (countO >= majority) {
                selectedCount++;
            }
        }
        
        // 출제될 문제의 수 출력
        System.out.println(selectedCount);
        
        scanner.close();
    }
}
