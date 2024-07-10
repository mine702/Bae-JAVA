import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();

        char[] chs = new char[10];

        int robot = 0;
        int box = 0;
        int end = 0;
        int answer = 0;

        for (int i = 0; i < chs.length; i++) {
            chs[i] = str.charAt(i);
            if (chs[i] == '@')
                robot = i;
            if (chs[i] == '#')
                box = i;
            if (chs[i] == '!')
                end = i;
        }
        // 로봇과 박스 사이에 목적지가 있으면 -1
        // 로봇이 박스보다 작은데 목적지가 로봇보다 더 작으면 -1
        // 로봇이 박스보다 큰데 목적지가 목적지가 로봇보다 크면 -1
        if ((robot < box && end < robot) || (robot > box && end > robot) || (robot < end && end < box)
                || (box < end && end < robot))
            answer = -1;
        else {
            // 로봇 1 상자 3 목적지 4 상자와 목적지가 한칸 차이가나서 로봇은 상자까지만 가면된다
            // 로봇 1 상자 3 목적지 6 .@.#..!.. 걍 이거 로봇 목적지 차이 아님?
            // 로봇 6 상자 3 목적지 1 이면? 애도 그냥 로봇 목적지 차이다
            if (robot < box) {
                answer = end - robot - 1;
            } else {
                answer = robot - end - 1;
            }
        }
        sb.append(answer);
        System.out.println(sb);
    }
}