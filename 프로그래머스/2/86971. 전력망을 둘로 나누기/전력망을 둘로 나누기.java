import java.util.*;

class Solution {
    public static List<Integer>[] numbers;
    public static int min;

    public static int solution(int n, int[][] wires) {
        min = n;
        numbers = new ArrayList[n + 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            numbers[wire[0]].add(wire[1]);
            numbers[wire[1]].add(wire[0]);
        }

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].size(); j++) {
                DFS(n, i, numbers[i].get(j));
            }
        }
        
        int answer = min;
        return answer;
    }

    public static void DFS(int n, int start, int noCheck) {
        Queue<Integer> queue = new PriorityQueue<>();
        boolean[] isCheck = new boolean[n + 1];
        int size = 1;

        isCheck[noCheck] = true;
        isCheck[start] = true;
        queue.add(start);

        while (true) {
            if (queue.isEmpty()) {
                break;
            }
            int number = queue.poll();

            for (int i = 0; i < numbers[number].size(); i++) {
                int num = numbers[number].get(i);

                if (isCheck[num])
                    continue;

                queue.add(num);
                isCheck[num] = true;
                size++;
            }
        }

        int answers = n - 2 * size;

        if (answers < 0)
            answers *= -1;

        if (min > answers)
            min = answers;
    }
}