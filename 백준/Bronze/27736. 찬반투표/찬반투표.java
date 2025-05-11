import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 재학생 수
        int approve = 0;
        int reject = 0;
        int abstain = 0;

        for (int i = 0; i < N; i++) {
            int vote = sc.nextInt();
            if (vote == 1) {
                approve++;
            } else if (vote == -1) {
                reject++;
            } else {
                abstain++;
            }
        }

        // 기권이 과반수 이상이면 무효
        if (abstain >= (N + 1) / 2) {
            System.out.println("INVALID");
        } else if (approve > reject) {
            System.out.println("APPROVED");
        } else {
            System.out.println("REJECTED");
        }

        sc.close();
    }
}
