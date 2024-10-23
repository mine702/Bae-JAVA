import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] sequence;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        sequence = new int[M];
        
        generateSequences(0, 1);
    }

    static void generateSequences(int depth, int start) {
        if (depth == M) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            sequence[depth] = i;
            generateSequences(depth + 1, i);
        }
    }
}
