import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.printf(" ");
        }
        System.out.println("*");

        for (int i = 2; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf(" ");
            }
            System.out.printf("*");
            for (int j = 1; j <= (i - 1) * 2 - 1; j++) {
                System.out.printf(" ");
            }
            System.out.println("*");

        }

        if (n != 1) {
            for (int z = 1; z < 2 * n; z++) {
                System.out.printf("*");
            }
        }
    }
}