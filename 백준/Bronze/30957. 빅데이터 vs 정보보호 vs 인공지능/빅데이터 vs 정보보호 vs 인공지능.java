import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine()); // 학생 수
        String input = sc.nextLine(); // 응답 문자열

        int bCount = 0;
        int sCount = 0;
        int aCount = 0;

        // 문자 수 세기
        for (char c : input.toCharArray()) {
            if (c == 'B') bCount++;
            else if (c == 'S') sCount++;
            else if (c == 'A') aCount++;
        }

        int max = Math.max(bCount, Math.max(sCount, aCount));

        boolean isB = (bCount == max);
        boolean isS = (sCount == max);
        boolean isA = (aCount == max);

        // 결과 출력
        if (isB && isS && isA) {
            System.out.println("SCU");
        } else {
            StringBuilder sb = new StringBuilder();
            if (isB) sb.append("B");
            if (isS) sb.append("S");
            if (isA) sb.append("A");
            System.out.println(sb.toString());
        }

        sc.close();
    }
}
