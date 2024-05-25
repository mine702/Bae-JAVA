import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 입력 받기
        int n = scanner.nextInt();

        // 각 히스토그램의 크기를 입력 받아 처리
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            printHistogram(k);
        }

        scanner.close();
    }

    // 히스토그램을 출력하는 메서드
    public static void printHistogram(int k) {
        StringBuilder histogram = new StringBuilder();
        for (int i = 0; i < k; i++) {
            histogram.append('=');
        }
        System.out.println(histogram.toString());
    }
}
