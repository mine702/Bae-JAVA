import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        if (S == 0) {
            if (T >= 12 && T <= 16)
                sb.append("320");
            else
                sb.append("280");
        } else
            sb.append("280");
        System.out.println(sb);
    }
}