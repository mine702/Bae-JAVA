import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int surfaceHeight = 0; 
        int platformHeight = 0; 
        
        for (int i = 1; i <= N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            surfaceHeight += A;
            platformHeight += B;
            
            int depth = surfaceHeight - platformHeight;
            System.out.println(depth);
        }
        
        sc.close();
    }
}
