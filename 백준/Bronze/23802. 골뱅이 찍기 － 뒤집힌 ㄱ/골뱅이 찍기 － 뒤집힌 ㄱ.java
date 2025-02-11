import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5 * N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 4 * N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
