import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t1 = sc.nextInt(); // 오늘의 기온
        int v1 = sc.nextInt(); // 오늘의 풍속
        int t2 = sc.nextInt(); // 내일의 기온
        int v2 = sc.nextInt(); // 내일의 풍속
        
        sc.close();
        
        // 폭풍 경고 조건 확인
        if (t2 < 0 && v2 >= 10) {
            System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
            return;
        }
        
        // 기온이 떨어지는 경우 경고
        if (t2 < t1) {
            System.out.println("MCHS warns! Low temperature is expected tomorrow.");
            return;
        }
        
        // 바람이 강해지는 경우 경고
        if (v2 > v1) {
            System.out.println("MCHS warns! Strong wind is expected tomorrow.");
            return;
        }
        
        // 어떤 메시지도 보낼 필요가 없는 경우
        System.out.println("No message");
    }
}