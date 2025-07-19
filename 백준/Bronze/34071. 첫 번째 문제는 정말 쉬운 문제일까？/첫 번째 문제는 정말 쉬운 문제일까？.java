import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }

        int first = X[0];
        int min = X[0];
        int max = X[0];

        for (int i = 1; i < N; i++) {
            if (X[i] < min) min = X[i];
            if (X[i] > max) max = X[i];
        }

        if (first == min) {
            System.out.println("ez");
        } else if (first == max) {
            System.out.println("hard");
        } else {
            System.out.println("?");
        }
    }
}
