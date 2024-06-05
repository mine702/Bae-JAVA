import java.util.Scanner;

public class Main {

    static int x;

    public static void f(int n) {
        if (n == 0) {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            if (x != 1) {
                System.out.println("Go to the store and buy some more, " + x + " bottles of beer on the wall.");
            } else {
                System.out.println("Go to the store and buy some more, " + x + " bottle of beer on the wall.");
            }
            return;
        }
        if (n == 1) {
            System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
            System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
            return;
        }
        System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer.");
        if (n - 1 != 1) {
            System.out.println("Take one down and pass it around, " + (n - 1) + " bottles of beer on the wall.\n");
        } else {
            System.out.println("Take one down and pass it around, " + (n - 1) + " bottle of beer on the wall.\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        x = n;
        for (int i = n; i >= 0; i--) {
            f(i);
        }
    }
}
