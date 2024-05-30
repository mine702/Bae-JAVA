import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에 재수강할 과목의 과목 코드가 주어진다.
        String retakeCourseCode = scanner.nextLine();

        // 두 번째 줄에 수강 신청 가능한 과목의 개수 N이 주어진다.
        int n = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 처리

        // 재수강할 과목의 앞 5자리를 추출한다.
        String retakeCoursePrefix = retakeCourseCode.substring(0, 5);

        int count = 0;

        // N개의 줄에 걸쳐 수강 신청 가능한 과목의 과목 코드가 주어진다.
        for (int i = 0; i < n; i++) {
            String availableCourseCode = scanner.nextLine();

            // 각 과목 코드의 앞 5자리를 비교한다.
            if (availableCourseCode.substring(0, 5).equals(retakeCoursePrefix)) {
                count++;
            }
        }

        // 재수강으로 인정되는 과목의 개수를 출력한다.
        System.out.println(count);
    }
}
