import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        
        String original = "UAPC";
        StringBuilder missing = new StringBuilder();
        
        int index = 0;
        for (char c : original.toCharArray()) {
            if (index < input.length() && c == input.charAt(index)) {
                index++;
            } else {
                missing.append(c);
            }
        }
        
        System.out.println(missing.toString());
    }
}