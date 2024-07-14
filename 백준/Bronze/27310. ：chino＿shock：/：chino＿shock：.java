import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emoji = scanner.nextLine();
        int difficulty = calculateDifficulty(emoji);
        System.out.println(difficulty);
    }

    public static int calculateDifficulty(String emoji) {
        int length = emoji.length();
        int colonCount = 2; // 이모지는 항상 콜론으로 시작하고 끝나므로 콜론 개수는 2
        int underscoreCount = 0;
        
        for (char c : emoji.toCharArray()) {
            if (c == '_') {
                underscoreCount++;
            }
        }
        
        return length + colonCount + (underscoreCount * 5);
    }
}
