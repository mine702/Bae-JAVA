import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] a = new int[10];
        int[] b = new int[10];
        int awin = 0, bwin = 0;

        // A의 카드 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // B의 카드 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // 라운드별 승자 판단
        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]) {
                awin++;
            } else if (a[i] < b[i]) {
                bwin++;
            }
        }

        // 최종 승자 출력
        if (awin > bwin) {
            System.out.println("A");
        } else if (awin < bwin) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}
