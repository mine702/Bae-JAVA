import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄 입력: 1차 티켓팅에서 팔린 티켓들의 수 N
        int N = scanner.nextInt();

        // 두 번째 줄 입력: 1차 티켓팅에서 팔린 티켓들의 번호 Ai
        Set<Integer> soldTickets = new HashSet<>();
        for (int i = 0; i < N; i++) {
            soldTickets.add(scanner.nextInt());
        }

        // 1번부터 시작하여 팔리지 않은 가장 작은 번호 찾기
        int ticketNumber = 1;
        while (true) {
            if (!soldTickets.contains(ticketNumber)) {
                System.out.println(ticketNumber);
                break;
            }
            ticketNumber++;
        }

        scanner.close();
    }
}
