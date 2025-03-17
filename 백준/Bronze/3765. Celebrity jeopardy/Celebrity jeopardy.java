import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input until the end
        while (scanner.hasNextLine()) {
            String equation = scanner.nextLine();
            System.out.println(equation);
        }
        
        scanner.close();
    }
}
