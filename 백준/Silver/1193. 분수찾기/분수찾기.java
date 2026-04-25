import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int group = 1;
        int check = 0;

        for (int i = 1; i < N; i++) {
            check = check + 1;
            if (group == check) {
                group = group + 1;
                check = 0;
            }
        }

        int one = 0;
        int two = 0;

        if (group % 2 == 0) {
            one = 1;
            two = group;

            for (int i = 0; i < check; i++) {
                one++;
                two--;
            }
        } else {
            one = group;
            two = 1;
            for (int i = 0; i < check; i++) {
                one--;
                two++;
            }
        }

        sb.append(one + "/" + two);
        System.out.println(sb);
    }
}