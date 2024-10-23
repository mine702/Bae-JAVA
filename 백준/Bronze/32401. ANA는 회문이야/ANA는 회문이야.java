import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 3; j <= n; j++) {
                String subStr = s.substring(i, j);
                if (isSimilarANA(subStr)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    private static boolean isSimilarANA(String str) {
        if (str.length() < 3) {
            return false;
        }

        if (str.charAt(0) != 'A' || str.charAt(str.length() - 1) != 'A') {
            return false;
        }

        int countA = 0;
        int countN = 0;

        for (char c : str.toCharArray()) {
            if (c == 'A') {
                countA++;
            } else if (c == 'N') {
                countN++;
            }
        }

        return countA == 2 && countN == 1;
    }
}
