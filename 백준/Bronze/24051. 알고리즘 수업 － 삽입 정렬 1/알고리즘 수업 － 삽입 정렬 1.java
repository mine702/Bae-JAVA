import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        insertionSort(K, nums);
    }

    public static void insertionSort(int K, int[] nums) {
        int count = 0;
        int answer = 0;
        int start = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (count == K)
                break;

            int index = start;
            int number = nums[index];
            while (true) {
                if (index == 0 || number >= nums[index - 1]) {
                    if (index == start)
                        break;

                    if (++count == K) {
                        answer = number;
                        break;
                    }

                    nums[index] = number;
                    break;
                }
                if (++count == K) {
                    answer = nums[index - 1];
                    break;
                }

                nums[index] = nums[index - 1];
                index--;
            }
            start++;
        }

        if (count < K)
            System.out.print("-1");
        else
            System.out.print(answer);
    }
}
