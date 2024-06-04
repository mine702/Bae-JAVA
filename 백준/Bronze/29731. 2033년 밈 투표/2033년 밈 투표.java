import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        boolean changed = false;
        for (int i = 0; i < N; i++) {
            String promise = scanner.nextLine().trim();
            if (!promise.equals("Never gonna give you up") &&
                !promise.equals("Never gonna let you down") &&
                !promise.equals("Never gonna run around and desert you") &&
                !promise.equals("Never gonna make you cry") &&
                !promise.equals("Never gonna say goodbye") &&
                !promise.equals("Never gonna tell a lie and hurt you") &&
                !promise.equals("Never gonna stop")) {
                changed = true;
                break;
            }
        }

        if (changed) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
