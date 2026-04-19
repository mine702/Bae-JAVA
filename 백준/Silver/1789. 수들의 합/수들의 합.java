import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static ArrayList<Long> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Long s = Long.parseLong(br.readLine());

        list.add(1L);

        int index = 1;
        int count = 1;
        long next = 2L;

        while (true) {
            long num = list.get(index - 1);

            if (num > s)
                break;

            count++;
            index++;

            list.add(num + next++);
        }
        sb.append(count - 1);
        System.out.println(sb);
    }
}