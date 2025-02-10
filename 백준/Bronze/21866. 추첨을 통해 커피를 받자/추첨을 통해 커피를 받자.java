import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] maxScores = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int[] scores = new int[9];
        
        int totalScore = 0;
        boolean isHacker = false;
        
        for (int i = 0; i < 9; i++) {
            scores[i] = scanner.nextInt();
            if (scores[i] > maxScores[i]) {
                isHacker = true;
            }
            totalScore += scores[i];
        }
        
        scanner.close();
        
        if (isHacker) {
            System.out.println("hacker");
        } else if (totalScore >= 100) {
            System.out.println("draw");
        } else {
            System.out.println("none");
        }
    }
}