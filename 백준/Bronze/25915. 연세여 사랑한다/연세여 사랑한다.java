import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.next().charAt(0);
        scanner.close();
        
        String password = "ILOVEYONSEI";
        int moves = 0;
        char current = start;
        
        for (char target : password.toCharArray()) {
            moves += Math.abs(current - target);
            current = target;
        }
        
        System.out.println(moves);
    }
}
