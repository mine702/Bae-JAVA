import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] spaceJunk = new int[n];

        for (int i = 0; i < n; i++) {
            spaceJunk[i] = sc.nextInt();
        }

        int minJunk = Integer.MAX_VALUE;
        int day = 0;

        for (int i = 0; i < n; i++) {
            if (spaceJunk[i] < minJunk) {
                minJunk = spaceJunk[i];
                day = i;
            }
        }

        System.out.println(day);
    }
}