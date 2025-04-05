import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 줄: N 입력 받기
        int N = Integer.parseInt(br.readLine());
        
        // 두 번째 줄: N개의 정수 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(A);

        // 마지막 원소 출력
        System.out.println(A[N - 1]);
    }
}
