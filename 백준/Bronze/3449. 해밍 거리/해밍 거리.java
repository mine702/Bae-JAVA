import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());  // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            String s1 = sc.nextLine().trim();  // 첫 번째 이진수
            String s2 = sc.nextLine().trim();  // 두 번째 이진수

            int hammingDistance = 0;

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    hammingDistance++;
                }
            }

            System.out.println("Hamming distance is " + hammingDistance + ".");
        }

        sc.close();
    }
}
