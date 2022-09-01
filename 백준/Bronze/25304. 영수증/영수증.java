import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mon = scanner.nextInt();
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            sum += A * B;
        }
        if (sum == mon) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}