import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int sum = 0;
        scanner.close();
        for (int i = 1; i <= A; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}