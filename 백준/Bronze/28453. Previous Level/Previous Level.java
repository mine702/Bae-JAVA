import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] levels = new int[N];
        for (int i = 0; i < N; i++) {
            levels[i] = scanner.nextInt();
        }
        
        for (int level : levels) {
            if (level == 300) {
                System.out.print(1 + " ");
            } else if (level >= 275) {
                System.out.print(2 + " ");
            } else if (level >= 250) {
                System.out.print(3 + " ");
            } else {
                System.out.print(4 + " ");
            }
        }
    }
}
