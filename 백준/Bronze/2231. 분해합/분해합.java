import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(br.readLine());
        play(answer);
        br.close();
        bw.flush();
        bw.close();
    }

    public static void play(int answer) throws IOException {
        int answers = 0;
        for (int i = 1; i < 1000000; i++) {
            int sum = i;
            int num = i;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            if (sum == answer) {
                answers = i;
                break;
            }
        }
        if (answers == 0) {
            bw.write(String.valueOf(answers));
        } else {
            bw.write(String.valueOf(answers));
        }
    }
}