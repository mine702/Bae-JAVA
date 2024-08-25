import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int H = sc.nextInt();
        
        int[] damage = new int[N];
        for (int i = 0; i < N; i++) {
            damage[i] = sc.nextInt();
        }
        
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (H <= 0) {
                break;
            }
            H -= damage[i];
            count++;
        }
        
        if (H > 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
        
        sc.close();
    }
}
