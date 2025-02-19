import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            String round;
            
            if (N > 4500) {
                round = "Round 1";
            } else if (N > 1000) {
                round = "Round 2";
            } else if (N > 25) {
                round = "Round 3";
            } else {
                round = "World Finals";
            }
            
            System.out.println("Case #" + i + ": " + round);
        }
        
        sc.close();
    }
}
