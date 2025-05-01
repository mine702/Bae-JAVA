import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리
        
        int jinjuFare = 0;
        int[] fares = new int[N];
        
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String destination = parts[0];
            int fare = Integer.parseInt(parts[1]);
            fares[i] = fare;
            
            if (destination.equals("jinju")) {
                jinjuFare = fare;
            }
        }
        
        int count = 0;
        for (int fare : fares) {
            if (fare > jinjuFare) {
                count++;
            }
        }
        
        System.out.println(jinjuFare);
        System.out.println(count);
    }
}
