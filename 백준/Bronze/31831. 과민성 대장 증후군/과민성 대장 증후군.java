import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄 입력 받기
        int N = scanner.nextInt();  // 스트레스 변화를 관찰한 일수
        int M = scanner.nextInt();  // 복통을 겪게 되는 스트레스의 양

        // 둘째 줄 입력 받기
        int[] stressChanges = new int[N];
        for (int i = 0; i < N; i++) {
            stressChanges[i] = scanner.nextInt();
        }

        // 초기 스트레스 양
        int currentStress = 0;
        int daysWithPain = 0;

        // 스트레스 변화량을 통해 일별 스트레스 양 계산
        for (int i = 0; i < N; i++) {
            currentStress += stressChanges[i];
            
            // 스트레스가 0 이하로 내려가는 경우 처리
            if (currentStress < 0) {
                currentStress = 0;
            }

            // 현재 스트레스가 M 이상이면 복통을 겪는 날 수 증가
            if (currentStress >= M) {
                daysWithPain++;
            }
        }

        // 결과 출력
        System.out.println(daysWithPain);

        scanner.close();
    }
}
