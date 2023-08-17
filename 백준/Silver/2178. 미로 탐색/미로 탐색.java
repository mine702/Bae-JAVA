import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dI = {-1, 1, 0, 0}; // 상, 하, 좌, 우
        int[] dJ = {0, 0, -1, 1};
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N + 2][M + 2];
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 1; j <= M; j++) {
                map[i][j] = c[j - 1] - '0';
            }
        }

        boolean[][] visited = new boolean[N + 2][M + 2]; // 방문 여부를 저장하는 배열
        Queue<int[]> q = new LinkedList<int[]>();
        int[] start = {1, 1, 1}; // 시작 좌표와 이동 거리
        q.add(start);
        visited[1][1] = true; // 시작 지점 방문 처리

        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int i = temp[0];
            int j = temp[1];
            int depth = temp[2];

            if (i == N && j == M) {
                ans = Math.min(depth, ans);
                break;
            }

            for (int d = 0; d < 4; d++) {
                int newI = i + dI[d];
                int newJ = j + dJ[d];
                if (map[newI][newJ] == 1 && !visited[newI][newJ]) {
                    temp = new int[3];
                    temp[0] = newI;
                    temp[1] = newJ;
                    temp[2] = depth + 1;
                    visited[newI][newJ] = true;
                    if (temp[2] >= ans) continue;
                    q.add(temp);
                }
            }
        }

        System.out.println(ans);
    }
}
