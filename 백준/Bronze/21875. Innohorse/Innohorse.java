import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        String start = scanner.next();
        String end = scanner.next();
        scanner.close();
        
        // Convert chess notation to board indices
        int x1 = start.charAt(0) - 'a';
        int y1 = start.charAt(1) - '1';
        int x2 = end.charAt(0) - 'a';
        int y2 = end.charAt(1) - '1';
        
        // Calculate absolute movement distances
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        
        // Ensure x <= y in output
        int x = Math.min(dx, dy);
        int y = Math.max(dx, dy);
        
        System.out.println(x + " " + y);
    }
}