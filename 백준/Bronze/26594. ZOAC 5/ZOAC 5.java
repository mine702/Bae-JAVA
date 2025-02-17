import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        
        int res = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                res++;
            } else {
                break;
            }
        }
        
        System.out.println(res);
    }
}