import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine()); 
        for (int i = 0; i < T; i++) {
            String S = sc.nextLine();
            String result = S.replace("PO", "PHO"); 
            System.out.println(result);
        }
    }
}
