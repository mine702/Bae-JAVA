import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 사용 가능한 교시의 개수
        int X = sc.nextInt(); // 건우가 예약한 교시
        int N = sc.nextInt(); // 조원의 수
        
        boolean allCanAttend = true;
        
        for (int i = 0; i < N; i++) {
            int K = sc.nextInt(); // 조원의 참석 가능한 교시 개수
            boolean canAttend = false;
            
            for (int j = 0; j < K; j++) {
                int availableTime = sc.nextInt();
                if (availableTime == X) {
                    canAttend = true;
                }
            }
            
            if (!canAttend) {
                allCanAttend = false;
            }
        }
        
        System.out.println(allCanAttend ? "YES" : "NO");
        
        sc.close();
    }
}
