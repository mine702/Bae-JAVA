import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        boolean start = false;
        int count = 0;
        while (true) {
            String word = br.readLine();
            if (word.equals("고무오리 디버깅 시작")) {
                start = true;
            } else {
                if (start) {
                    if (word.equals("문제")) {
                        count++;
                    } else if (word.equals("고무오리")) {
                        if (count == 0) {
                            count += 2;
                        } else {
                            count--;
                        }
                    } else if (word.equals("고무오리 디버깅 끝")) {
                        break;
                    }
                }
            }
        }
        if (count == 0) {
            sb.append("고무오리야 사랑해");
        } else {
            sb.append("힝구");
        }
        System.out.println(sb);
        br.close();
    }
}