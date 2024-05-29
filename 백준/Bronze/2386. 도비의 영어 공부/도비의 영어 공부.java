import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("#")) {
                break;
            }

            char targetChar = input.charAt(0);
            String sentence = input.substring(2);

            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                char currentChar = sentence.charAt(i);
                if (Character.toLowerCase(currentChar) == targetChar) {
                    count++;
                }
            }

            System.out.println(targetChar + " " + count);
        }

        scanner.close();
    }
}
