import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 1수로 가능한지 확인 (같은 행 또는 같은 열, 사이에 B 없음)
        if (a == 0) {
            // 같은 행: row=0, col 0→b로 진행. B가 그 사이에 있으면 막힘.
            if (!(x == 0 && 0 < y && y < b)) {
                System.out.println(1);
                return;
            }
            // 사이에 있으면 1수 불가
        } else if (b == 0) {
            // 같은 열: col=0, row 0→a로 진행. B가 그 사이에 있으면 막힘.
            if (!(y == 0 && 0 < x && x < a)) {
                System.out.println(1);
                return;
            }
            // 사이에 있으면 1수 불가
        }

        // 여기부터는 기본적으로 2수 이상
        // 두 가지 2수 경로가 모두 막히면 3수, 아니면 2수

        // 경로1: (0,0) -> (0,b) -> (a,b)
        boolean blocked1 = false;
        // 첫 구간: 행 0, 열 0→b (코너 포함: B가 (0,b)여도 불가)
        if (x == 0 && 0 < y && y <= b) blocked1 = true;
        // 둘째 구간: 열 b, 행 0→a (코너 포함: B가 (a,b)일 일은 없음(상대 말), 하지만 코너 (0,b)는 위에서 처리)
        if (y == b && 0 < x && x <= a) blocked1 = true;

        // 경로2: (0,0) -> (a,0) -> (a,b)
        boolean blocked2 = false;
        // 첫 구간: 열 0, 행 0→a (코너 포함)
        if (y == 0 && 0 < x && x <= a) blocked2 = true;
        // 둘째 구간: 행 a, 열 0→b (코너 포함)
        if (x == a && 0 < y && y <= b) blocked2 = true;

        if (blocked1 && blocked2) {
            System.out.println(3);
        } else {
            System.out.println(2);
        }
    }
}
