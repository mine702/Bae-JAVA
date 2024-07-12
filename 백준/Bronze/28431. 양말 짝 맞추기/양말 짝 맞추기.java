import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자별로 양말의 개수를 세기 위한 HashMap
        Map<Integer, Integer> sockCounts = new HashMap<>();

        // 양말 5개의 숫자를 입력 받음
        for (int i = 0; i < 5; i++) {
            int sock = scanner.nextInt();
            sockCounts.put(sock, sockCounts.getOrDefault(sock, 0) + 1);
        }

        scanner.close();

        // 두 쌍을 만들고 남는 양말 찾기
        int remainingSock = -1;
        for (Map.Entry<Integer, Integer> entry : sockCounts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                remainingSock = entry.getKey();
                break;
            }
        }

        // 남는 양말의 숫자 출력
        System.out.println(remainingSock);
    }
}
