import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열 크기
        int K = Integer.parseInt(st.nextToken()); // 목표 교환 횟수
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int swapCount = 0;
        boolean found = false;

        // 선택 정렬
        for (int last = N - 1; last > 0; last--) {
            int maxIndex = 0;
            for (int i = 1; i <= last; i++) {
                if (A[i] > A[maxIndex]) {
                    maxIndex = i;
                }
            }
            if (last != maxIndex) {
                int temp = A[last];
                A[last] = A[maxIndex];
                A[maxIndex] = temp;
                swapCount++;

                if (swapCount == K) {
                    printArray(A);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }

    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
