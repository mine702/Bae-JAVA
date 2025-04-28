import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 팀 수
        int[][] times = new int[N][3]; // 팀별 문제 풀이 시간

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                times[i][j] = sc.nextInt();
            }
        }

        int count = 0; // 성실하게 참여한 팀 수

        for (int i = 0; i < N; i++) {
            if (isSincere(times[i])) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 성실한 팀인지 판단하는 함수
    public static boolean isSincere(int[] time) {
        // 1. 최소 하나는 문제를 해결했는지 확인
        boolean solvedAtLeastOne = false;
        for (int t : time) {
            if (t != -1) {
                solvedAtLeastOne = true;
                break;
            }
        }
        if (!solvedAtLeastOne) return false;

        // 2. 문제 번호 순서 + 시간 조건 확인
        for (int i = 0; i < 3; i++) {
            if (time[i] != -1) { // 현재 문제를 풀었으면
                // 앞 번호 문제들이 time[i] 이하이어야 함
                for (int j = 0; j < i; j++) {
                    if (time[j] == -1 || time[j] > time[i]) {
                        return false;
                    }
                }
                // 뒷 번호 문제들이 time[i] 이상이어야 함
                for (int j = i + 1; j < 3; j++) {
                    if (time[j] != -1 && time[j] < time[i]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
