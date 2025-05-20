import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt(); // 데이터셋 개수
        
        for (int i = 1; i <= K; i++) {
            int h = sc.nextInt(); // 머리 개수
            sc.nextLine(); // 개행 제거
            String actions = sc.nextLine();
            
            for (char action : actions.toCharArray()) {
                if (action == 'c') {
                    // 머리 하나 자르면 2개가 돼서 머리 +1
                    h = h - 1 + 2;
                } else if (action == 'b') {
                    // 머리 자르고 불 지지면 머리 -1
                    h = h - 1;
                }
                
                if (h <= 0) {
                    h = 0;
                    break;
                }
            }
            
            System.out.println("Data Set " + i + ":");
            System.out.println(h);
            System.out.println();
        }
        
        sc.close();
    }
}
