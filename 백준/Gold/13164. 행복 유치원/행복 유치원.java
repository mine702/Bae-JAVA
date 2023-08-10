import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] child = new int[N];
        for (int i = 0; i < N; i++) {
            child[i] = Integer.parseInt(st.nextToken());
        }

        // 각 아이들의 키 차이를 계산하여 저장
        int[] diff = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = child[i + 1] - child[i];
        }

        // 키 차이를 내림차순으로 정렬
        Arrays.sort(diff);
        int answer = 0;

        // 큰 키 차이부터 K-1개를 제외하고 합산
        for (int i = 0; i < N - K; i++) {
            answer += diff[i];
        }

        System.out.println(answer);
    }
}
