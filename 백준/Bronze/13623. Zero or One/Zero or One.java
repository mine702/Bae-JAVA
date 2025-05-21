import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        // A가 유일하게 다르다: A != B && A != C && B == C
        if (A != B && A != C && B == C) {
            System.out.println("A");
        }
        // B가 유일하게 다르다: B != A && B != C && A == C
        else if (B != A && B != C && A == C) {
            System.out.println("B");
        }
        // C가 유일하게 다르다: C != A && C != B && A == B
        else if (C != A && C != B && A == B) {
            System.out.println("C");
        }
        // 그 외는 모두 승자가 없음
        else {
            System.out.println("*");
        }
        
        sc.close();
    }
}

