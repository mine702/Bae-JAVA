import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        
        for (int i = 0; i < n; i++) {
            int X = scanner.nextInt(); 
            int Y = scanner.nextInt(); 
            
            if (X >= Y) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }
        
        scanner.close();
    }
}