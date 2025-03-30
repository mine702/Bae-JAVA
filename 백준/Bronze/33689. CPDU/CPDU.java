import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        int count = 0;
        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            if (name.charAt(0) == 'C') {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}