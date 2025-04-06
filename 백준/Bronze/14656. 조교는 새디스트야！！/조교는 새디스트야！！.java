import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생 수
        int[] current = new int[n];
        for (int i = 0; i < n; i++) {
            current[i] = sc.nextInt();
        }

        // 정렬된 복사본 생성
        int[] sorted = current.clone();
        Arrays.sort(sorted);

        // 맞지 않은 위치의 학생 수 세기
        int wrongCount = 0;
        for (int i = 0; i < n; i++) {
            if (current[i] != sorted[i]) {
                wrongCount++;
            }
        }

        System.out.println(wrongCount);
    }
}
