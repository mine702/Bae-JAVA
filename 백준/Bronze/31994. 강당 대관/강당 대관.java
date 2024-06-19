import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] seminarNames = new String[7];
        int[] applicants = new int[7];
        
        for (int i = 0; i < 7; i++) {
            seminarNames[i] = scanner.next();
            applicants[i] = scanner.nextInt();
        }
        
        int maxApplicantsIndex = 0;
        for (int i = 1; i < 7; i++) {
            if (applicants[i] > applicants[maxApplicantsIndex]) {
                maxApplicantsIndex = i;
            }
        }
        
        System.out.println(seminarNames[maxApplicantsIndex]);
        
        scanner.close();
    }
}
