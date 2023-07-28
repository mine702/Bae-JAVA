import java.io.*;
import java.util.*;

public class Main {

    private static int[][] relationship;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        relationship = new int[N + 1][N + 1]; // 인접 행렬로 변경

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            relationship[num1][num2] = 1;
            relationship[num2][num1] = 1;
        }

        // Floyd-Warshall 알고리즘을 이용하여 모든 사용자들 간의 최단 경로를 계산
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (relationship[i][k] != 0 && relationship[k][j] != 0) {
                        if (relationship[i][j] == 0 || relationship[i][j] > relationship[i][k] + relationship[k][j]) {
                            relationship[i][j] = relationship[i][k] + relationship[k][j];
                        }
                    }
                }
            }
        }

        // 케빈 베이컨의 수가 가장 작은 사용자 찾기
        int minBaconNumber = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            int baconNumberSum = 0;
            for (int j = 1; j <= N; j++) {
                baconNumberSum += relationship[i][j];
            }

            if (baconNumberSum < minBaconNumber) {
                minBaconNumber = baconNumberSum;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
