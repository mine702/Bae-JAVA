import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 깊이 측정값 4개 입력 받기
        int[] depths = new int[4];
        for (int i = 0; i < 4; i++) {
            depths[i] = sc.nextInt();
        }

        // 조건에 따라 출력
        if (depths[0] < depths[1] && depths[1] < depths[2] && depths[2] < depths[3]) {
            System.out.println("Fish Rising");
        } else if (depths[0] > depths[1] && depths[1] > depths[2] && depths[2] > depths[3]) {
            System.out.println("Fish Diving");
        } else if (depths[0] == depths[1] && depths[1] == depths[2] && depths[2] == depths[3]) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
