import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum != 180) {
            System.out.println("Error");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("Equilateral");
        } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
