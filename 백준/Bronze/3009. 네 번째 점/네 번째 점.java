import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 좌표 저장용 배열
        int[] x = new int[3];
        int[] y = new int[3];

        // 입력받기
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int fourthX, fourthY;

        // x 좌표 비교: 같은 값이 두 번, 다른 값이 한 번
        if (x[0] == x[1]) fourthX = x[2];
        else if (x[0] == x[2]) fourthX = x[1];
        else fourthX = x[0];

        // y 좌표 비교: 같은 값이 두 번, 다른 값이 한 번
        if (y[0] == y[1]) fourthY = y[2];
        else if (y[0] == y[2]) fourthY = y[1];
        else fourthY = y[0];

        System.out.println(fourthX + " " + fourthY);
    }
}
