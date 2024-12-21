import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S_ab = sc.nextInt();
        int F_ab = sc.nextInt();
        
        if (S_ab <= F_ab) {
            System.out.println("high speed rail");
        } else {
            System.out.println("flight");
        }

        sc.close();
    }
}
