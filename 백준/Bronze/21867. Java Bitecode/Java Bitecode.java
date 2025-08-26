import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 문자열 길이 (사실 안 써도 됨)
        String S = sc.next();
        sc.close();
        
        // J, A, V 제거
        String result = S.replaceAll("[JAV]", "");
        
        // 결과 출력
        if (result.isEmpty()) {
            System.out.println("nojava");
        } else {
            System.out.println(result);
        }
    }
}
