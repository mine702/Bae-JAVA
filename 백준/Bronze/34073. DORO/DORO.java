import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 단어의 개수 입력
        sc.nextLine();         // 개행 문자 처리
        
        String[] words = sc.nextLine().split(" ");  // 문장을 단어별로 분리
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(words[i]).append("DORO");
            if (i < N - 1) {
                result.append(" ");
            }
        }
        
        System.out.println(result.toString());
    }
}
