import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            String number = scanner.next();
            
            Set<Character> uniqueDigits = new HashSet<>();
            
            for (char digit : number.toCharArray()) {
                uniqueDigits.add(digit);
            }
            
            System.out.println(uniqueDigits.size());
        }
        
        scanner.close();
    }
}
