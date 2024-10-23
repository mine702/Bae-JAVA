import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        int[] combination = new int[m];
        generateCombinations(n, m, 1, 0, combination);
    }

    public static void generateCombinations(int n, int m, int start, int depth, int[] combination) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(combination[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            combination[depth] = i;
            generateCombinations(n, m, i + 1, depth + 1, combination);
        }
    }
}
