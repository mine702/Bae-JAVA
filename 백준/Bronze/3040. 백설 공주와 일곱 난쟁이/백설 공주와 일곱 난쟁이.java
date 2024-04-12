import java.util.*;
import java.io.*;

public class Main {

    public static int answer = -100;
    public static boolean isCheck = false;
    public static int[] answers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[9];
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
            answer += num;
        }

        combination(nums, new boolean[nums.length], 0, 0, 2);

        for (int i = 0; i < nums.length; i++) {
            if (answers[0] == nums[i] || answers[1] == nums[i])
                continue;
            sb.append(nums[i] + "\n");
        }
        System.out.println(sb);
    }

    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r) {
        if (isCheck)
            return;

        if (depth == r) {
            answers = new int[2];
            int index = 0;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    sum += arr[i];
                    answers[index++] = arr[i];
                }
            }
            if (sum == answer)
                isCheck = true;

            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (isCheck)
                return;

            if (!visited[i]) {
                visited[i] = true;
                combination(arr, visited, i + 1, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}