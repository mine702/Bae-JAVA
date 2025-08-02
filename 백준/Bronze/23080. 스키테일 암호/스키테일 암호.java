import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine().trim();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            answer.append(s.charAt(i));
        }

        System.out.println(answer.toString());
    }
}
