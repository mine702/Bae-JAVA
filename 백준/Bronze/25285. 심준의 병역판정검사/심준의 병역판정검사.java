import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        for (int i = 0; i < num; i++) {
            double cm = scanner.nextDouble();
            double kg = scanner.nextDouble();
            double bmi = kg / (cm * cm / 10000);
            
            if (cm < 140.1) {
                System.out.println(6);
            } else if (cm < 146) {
                System.out.println(5);
            } else if (cm < 159) {
                System.out.println(4);
            } else if (cm < 161) {
                if (bmi >= 16.0 && bmi < 35.0) {
                    System.out.println(3);
                } else {
                    System.out.println(4);
                }
            } else if (cm < 204) {
                if (bmi >= 20.0 && bmi < 25.0) {
                    System.out.println(1);
                } else if ((bmi >= 18.5 && bmi < 20.0) || (bmi >= 25.0 && bmi < 30.0)) {
                    System.out.println(2);
                } else if ((bmi >= 16.0 && bmi < 18.5) || (bmi >= 30.0 && bmi < 35.0)) {
                    System.out.println(3);
                } else {
                    System.out.println(4);
                }
            } else {
                System.out.println(4);
            }
        }
        
        scanner.close();
    }
}