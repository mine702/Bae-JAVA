import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int[] result = new int[4];

        for (int i = 0; i < P; i++) {
            int grade = scanner.nextInt();
            int classroom = scanner.nextInt();
            int number = scanner.nextInt();

            if (grade == 1) {
                result[3]++;
            } else if (classroom == 1 || classroom == 2) {
                result[0]++;
            } else if (classroom == 3) {
                result[1]++;
            } else if (classroom == 4) {
                result[2]++;
            }
        }

        for (int r : result) {
            System.out.println(r);
        }
    }
}
