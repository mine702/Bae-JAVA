import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        if (s.endsWith("driip")) {
            System.out.println("cute");
        } else {
            System.out.println("not cute");
        }
    }
}