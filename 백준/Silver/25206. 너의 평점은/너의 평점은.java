import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        HashMap<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double scoreSum = 0.0;
        double gradeSum = 0.0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String gradle = st.nextToken();

            if (gradle.equals("P"))
                continue;

            double value = map.get(gradle);
            scoreSum += score * value;
            gradeSum += score;
        }

        sb.append(String.format("%.6f", scoreSum / gradeSum));
        System.out.println(sb);
    }
}
