import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        int kbs1_idx = -1, kbs2_idx = -1;
        String[] channels = new String[n];

        for (int i = 0; i < n; i++) {
            channels[i] = scanner.nextLine();
            if (channels[i].equals("KBS1")) {
                kbs1_idx = i;
            }
            if (channels[i].equals("KBS2")) {
                kbs2_idx = i;
            }
        }

        if (kbs1_idx > kbs2_idx) {
            kbs2_idx++;
        }

        // KBS1을 첫 번째로 이동
        for (int i = 0; i < kbs1_idx; i++) {
            System.out.print("1");
        }
        for (int i = 0; i < kbs1_idx; i++) {
            System.out.print("4");
        }

        // KBS2를 두 번째로 이동
        if (kbs2_idx != 1) {
            for (int i = 0; i < kbs2_idx; i++) {
                System.out.print("1");
            }
            for (int i = 1; i < kbs2_idx; i++) {
                System.out.print("4");
            }
        }
    }
}
